package com.quiz.OutOfTheBox.model;

import java.util.ArrayList;
import java.util.Random;

public class Quiz {
    private Random randomQuestion;
    QnA question;


    //ArrayList<String> questarr;

    public Quiz(){
        //question.getListQuestion();
        randomQuestion = new Random();
        question = new QnA();
        //questarr = new ArrayList<>();
        //questarr.add("siapa?");
        //questarr.add("apa?");

    }

    public String getRandomQuestion(){
        QnA question = new QnA();
        int index = randomQuestion.nextInt(question.getListQuestion().size());
        String quest = question.getListQuestion().get(index);
        //System.out.println(index);
        //System.out.println("halo " + quest);
        return quest;
    }

    public static void main(String[] args) {
        Quiz question = new Quiz();
        System.out.println(question.getRandomQuestion());


    }

}
