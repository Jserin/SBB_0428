package com.ll.sbb1.Answer;


import com.ll.sbb1.Question.Question;
import com.ll.sbb1.Question.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping("/answer")
@Controller
public class AnswerController {
    private final QuestionService questionService;
    private final AnswerService answerService;

    @PostMapping("/create/{id}")
    public String  answerCreate(@PathVariable("id") Integer id, @RequestParam String content) {
        Question q = this.questionService.findbyId(id);
        this.answerService.answerCreate(q, content);

        return String.format("redirect:/question/detail/%s", id);
    }
}
