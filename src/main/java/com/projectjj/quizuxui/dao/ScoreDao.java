package com.projectjj.quizuxui.dao;

import com.projectjj.quizuxui.vo.Score;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScoreDao {

    void uploadScore(Score score);

}
