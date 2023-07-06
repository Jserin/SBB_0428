package com.ll.sbb1;

import com.ll.sbb1.Answer.Answer;
import com.ll.sbb1.Question.Question;
import com.ll.sbb1.Question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;

@SpringBootTest
class Sbb1ApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void contextLoads() {
		Question q = new Question();
		q.setSubject("테스트1번");
		q.setContent("테스트1번");
		q.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q);

		Question q1 = new Question();
		q1.setSubject("테스트2번");
		q1.setContent("테스트2번");
		q1.setCreateDate(LocalDateTime.now());
		this.questionRepository.save(q1);
	}


}
