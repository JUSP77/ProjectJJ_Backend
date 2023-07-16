package com.projectjj.quizuxui.restController;

import com.projectjj.quizuxui.dto.ResponseDto;
import com.projectjj.quizuxui.service.GameService;
import com.projectjj.quizuxui.vo.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest")
@CrossOrigin(origins = "*")
public class GameRestController {

    @Autowired
    GameService gameService;

    @PostMapping("/score")
    public ResponseDto<String> gamePoint(Score score) {

        ResponseDto<String> response = new ResponseDto<>();
        System.out.println(score.getResult());

        gameService.insertGameResult(score);
        response.setStatus("OK");
        return response;
    }


}
