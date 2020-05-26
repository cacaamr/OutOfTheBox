package com.quiz.OutOfTheBox.model;

import java.util.ArrayList;
import java.util.Random;

public class Quiz {
    private Random randomQuestion;
    public QnA qna;
    // ArrayList<String> questarr;

    public Quiz() {
        // question.getListQuestion();
        randomQuestion = new Random();
        qna = new QnA();
        // questarr = new ArrayList<>();
        // questarr.add("siapa?");
        // questarr.add("apa?");

    }

    public String getRandomQuestion() {
        int index = randomQuestion.nextInt(qna.getListQuestion().size());
        String quest = qna.getListQuestion().get(index);
        // System.out.println(index);
        // System.out.println("halo " + quest);
        return quest;
    }

    public static void main(String[] args) {
<<<<<<< HEAD
        // Quiz quiz = new Quiz();
        // System.out.println(quiz.getRandomQuestion());
        // QnA qna = new QnA();
        
=======
        Quiz quiz = new Quiz();
        System.out.println(quiz.getRandomQuestion());
>>>>>>> 00cbd93f8c79a375389e405d7f803186155d233d

    }

}
