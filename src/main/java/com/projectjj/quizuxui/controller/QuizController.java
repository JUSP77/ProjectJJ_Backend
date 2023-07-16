package com.projectjj.quizuxui.controller;

import com.projectjj.quizuxui.service.QuizService;
import com.projectjj.quizuxui.service.UserAnswerService;
import com.projectjj.quizuxui.vo.Quiz;
import com.projectjj.quizuxui.vo.QuizResultImg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@CrossOrigin(origins = "*")
public class QuizController {
    @Autowired
    QuizService quizService;
    @Autowired
    UserAnswerService userAnswerService;

    @PostMapping("/upload")
    public String uploadQuiz(
            @RequestParam int no,
            @RequestParam String correctAnswer,
            @RequestParam("imageA") MultipartFile imageA,
            @RequestParam("imageB") MultipartFile imageB,
            @RequestParam String hint,
            @RequestParam String explanation,
            RedirectAttributes redirectAttributes
    ) {
        try {
            // 퀴즈 저장
            quizService.uploadQuiz(no, correctAnswer, imageA, imageB, hint, explanation);
            redirectAttributes.addFlashAttribute("status", "OK");
        } catch (IOException e) {
            redirectAttributes.addFlashAttribute("status", "ERROR");
            redirectAttributes.addFlashAttribute("error", "퀴즈 업로드에 실패했습니다: " + e.getMessage());
        }

        return "/";
    }

    @GetMapping("/result")
    @ResponseBody
    public Map<String, Object> getResult(
            @RequestParam String userId,
            @RequestParam int countCorrectAnswer
    ) {
        System.out.println(userId);
        Map<String, Object> response = new HashMap<>();
        List<QuizResultImg> resultImgList = new ArrayList<>();

        QuizResultImg quizResultImg = quizService.getResultImg(countCorrectAnswer);
        System.out.println(quizResultImg.getUrl());
        System.out.println(quizResultImg.getNo());
        System.out.println(quizResultImg.getCorrectCount());

        response.put("result", quizResultImg);

        return response;
    }

}
