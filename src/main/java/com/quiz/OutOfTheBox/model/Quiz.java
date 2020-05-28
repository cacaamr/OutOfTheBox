package com.quiz.OutOfTheBox.model;

import java.util.ArrayList;
import java.util.Random;

public class Quiz {
    private Random randomQuestion;
    public QnA qna;
    public int index;
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
        index = randomQuestion.nextInt(qna.getListQuestion().size());
        String quest = qna.getListQuestion().get(index);


        // System.out.println(index);
        // System.out.println("halo " + quest);
        return quest;
    }



    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        System.out.println(quiz.getRandomQuestion());

    }

}
