package com.ll.sbb1.Question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class QuestionService {
    private final QuestionRepository questionRepository;

    public List<Question> list() {
        return questionRepository.findAll();
    }

    public Question findbyId(Integer id) {
        Optional<Question> q = this.questionRepository.findById(id);

        if(q.isPresent()) {
            Question oq = q.get();
            return oq;
        }
        return null;
    }
}
