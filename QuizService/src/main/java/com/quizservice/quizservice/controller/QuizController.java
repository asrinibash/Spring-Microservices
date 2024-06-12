package com.quizservice.quizservice.controller;

import com.quizservice.quizservice.entities.Quiz;
import com.quizservice.quizservice.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    //create
    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    //getAll
    @GetMapping
    public List<Quiz> getAll(){
        return quizService.get();
    }

    //getbyID
    @GetMapping("/{Id}")
    public Quiz getOne(@PathVariable Long Id){
        return quizService.get(Id);
    }
}
