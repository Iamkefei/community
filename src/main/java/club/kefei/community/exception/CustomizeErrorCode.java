package club.kefei.community.exception;

public enum  CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FOUND(2001, "你找到问题不在了,要不要换个试试？"),
    TARGET_PARAM_NOT_FOUND(2001, "为选中任何问题或者评论进行回复"),
    NO_LOGIN(2003, "未登录不能进行评论， 请先登录"),
    SYS_ERROR(2004, "服务器冒烟了, 要不你稍后再试试"),
    TYPE_PARAM_WRONG(2005, "评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006, "你找到评论不存在,要不要换个试试？");
    ;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }


    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
