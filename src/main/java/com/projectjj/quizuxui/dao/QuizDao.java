package com.projectjj.quizuxui.dao;

import com.projectjj.quizuxui.vo.Quiz;
import com.projectjj.quizuxui.vo.QuizResultImg;
import com.projectjj.quizuxui.vo.QuizStatistics;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QuizDao{

// Image A 인지 B인지 확인
    void insertQuiz(Quiz quiz);
    List<Quiz> getAllQuiz();
    void updateQuizStatistics(QuizStatistics quizStatistics);
    QuizStatistics getQuizStatistics(int quizNo);
    QuizResultImg getResultImg(int countCorrectAnswer);
}