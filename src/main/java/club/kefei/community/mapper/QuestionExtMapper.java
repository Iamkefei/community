package club.kefei.community.mapper;

import club.kefei.community.model.Question;

public interface QuestionExtMapper {
    int incView(Question record);

    int incCommentCount(Question record);
}
