package com.ll.sbb1.Question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
    @NotEmpty(message = "제목은 필수항목임")
    @Size(max=200)
    private String subject;

    @NotEmpty(message = "내용은 필수임")
    private String content;
}