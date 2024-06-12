package com.questionservice.questionservice.services.Implement;

import com.questionservice.questionservice.entities.Question;
import com.questionservice.questionservice.repositories.QuestionRepository;
import com.questionservice.questionservice.services.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question add(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    @Override
    public Question getOne(Long Id) {
        return questionRepository.findById(Id).orElseThrow(()->new RuntimeException("Question not found with ID: "+Id));
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
