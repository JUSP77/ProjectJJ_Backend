package com.projectjj.quizuxui.service;

import com.projectjj.quizuxui.dao.ScoreDao;
import com.projectjj.quizuxui.vo.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService {

    @Autowired
    ScoreDao scoreDao;

    public void uploadScore(Score score){

        scoreDao.uploadScore(score);
    }
}
