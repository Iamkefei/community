package club.kefei.community.dto;

import club.kefei.community.modal.Question;
import lombok.Data;

import java.util.List;

@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
}
