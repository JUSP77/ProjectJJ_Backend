package com.projectjj.quizuxui;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.projectjj.quizuxui.dao")
public class QuizUxuiApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuizUxuiApplication.class, args);
    }

}
