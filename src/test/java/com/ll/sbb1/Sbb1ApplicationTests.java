package com.ll.sbb1;

import com.ll.sbb1.Answer.Answer;
import com.ll.sbb1.Answer.AnswerRepository;
import com.ll.sbb1.Question.Question;
import com.ll.sbb1.Question.QuestionRepository;
import com.ll.sbb1.Question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Sbb1ApplicationTests {

	@Autowired
	private QuestionService questionService;

	@Test
	void testJpa() {
		for (int i = 1; i <= 100; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]", i);
			String content = "내용무";
			this.questionService.create(subject, content);
		}
	}

}
