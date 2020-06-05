package com.quiz.OutOfTheBox;

import java.util.ArrayList;
import java.util.Random;

public class Quiz {
    private Random randomQuestion;
    ArrayList<String> questarr;

    public Quiz(){
        //question.getListQuestion();
        randomQuestion = new Random();
        questarr = new ArrayList<>();
        questarr.add("siapa?");
        questarr.add("apa?");

    }

    public String getRandomQuestion(){
        //QnA question = new QnA();
        int index = randomQuestion.nextInt(questarr.size());
        String quest = questarr.get(index);
        System.out.println(quest);
        //System.out.println(index);
        //System.out.println("halo " + quest);
        return quest;
    }


    public static void main(String[] args) {
        Quiz question = new Quiz();
        question.getRandomQuestion();

    }

}
