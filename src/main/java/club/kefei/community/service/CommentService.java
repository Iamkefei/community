package club.kefei.community.service;

import club.kefei.community.exception.CustomizeErrorCode;
import club.kefei.community.exception.CustomizeException;
import club.kefei.community.model.Comment;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    public void insert(Comment comment) {
        if(comment.getParentId() == null || comment.getParentId() == 0) {
            throw new CustomizeException(CustomizeErrorCode.TARGET_PARAM_NOT_FOUND);
        }
    }
}
