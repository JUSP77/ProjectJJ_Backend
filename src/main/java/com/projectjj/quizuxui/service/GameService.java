package com.projectjj.quizuxui.service;


import com.projectjj.quizuxui.dao.GameDao;
import com.projectjj.quizuxui.vo.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    private GameDao gameDao;

    public void insertGameResult(Score score){
         gameDao.insertGameResult(score);
    }
}
