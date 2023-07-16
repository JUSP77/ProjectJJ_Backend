package com.projectjj.quizuxui.controller;


import com.projectjj.quizuxui.service.ScoreService;
import com.projectjj.quizuxui.vo.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@CrossOrigin(origins = "*")
public class ScoreController {

    @Autowired
    ScoreService scoreService;
    Score score = new Score();

    @PostMapping("/score")
    public String uploadScore(
            @RequestParam String no,
            @RequestParam String result,
            RedirectAttributes redirectAttributes
    ) {

        score.setNo(Integer.parseInt(no));
        score.setResult(result);
        System.out.println(score.getNo());
        scoreService.uploadScore(score);

        return "/";
    }

}