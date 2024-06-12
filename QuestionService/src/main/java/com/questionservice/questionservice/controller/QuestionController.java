package com.questionservice.questionservice.controller;

import com.questionservice.questionservice.entities.Question;
import com.questionservice.questionservice.services.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.add(question);
    }

    @GetMapping
    public List<Question> getAll(){
        return questionService.get();
    }

    @GetMapping("/{Id}")
    public Question getOne(@PathVariable Long Id){
        return questionService.getOne(Id);
    }

    //Get Question on Specific Id

    @GetMapping("/quiz/{Id}")
    public List<Question> getQuestionsOfQuiz(@PathVariable Long Id){
        return questionService.getQuestionsOfQuiz(Id);
    }
}
