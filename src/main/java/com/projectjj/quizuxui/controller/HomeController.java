package com.projectjj.quizuxui.controller;

import com.projectjj.quizuxui.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class HomeController {

    @Autowired
    QuizService quizService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/test")
    public String Test() throws IOException{
        quizService.updateQuizStatistics(1, "O");
        return "home";
    }

}
