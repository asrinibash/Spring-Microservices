package com.quizservice.quizservice.services;

import com.quizservice.quizservice.entities.Quiz;

import java.util.List;

public interface QuizService {

    Quiz add(Quiz quiz);

    List<Quiz> get();

    Quiz get(Long Id);



}
