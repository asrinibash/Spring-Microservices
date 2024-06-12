package com.questionservice.questionservice.services;

import com.questionservice.questionservice.entities.Question;

import java.util.List;

public interface QuestionService {

    Question add(Question question);

    List<Question> get();
    Question getOne(Long Id);

    List<Question> getQuestionsOfQuiz(Long quizId);
}
