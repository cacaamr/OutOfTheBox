package com.quiz.OutOfTheBox.model;

import java.util.ArrayList;
import java.util.Random;

public class Quiz {
    private Random randomQuestion;
    public QnA qna;
    
    public Quiz() {
        randomQuestion = new Random();
        qna = new QnA();

    }

    public String getRandomQuestion() {
        int index = randomQuestion.nextInt(qna.getListQuestion().size());
        String quest = qna.getListQuestion().get(index);
        return quest;
    }

    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        System.out.println(quiz.getRandomQuestion());
        

    }

}
