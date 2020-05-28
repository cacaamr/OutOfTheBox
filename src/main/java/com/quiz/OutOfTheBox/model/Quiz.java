package com.quiz.OutOfTheBox.model;

import java.util.ArrayList;
import java.util.Random;

public class Quiz {
    private Random randomQuestion;
    public QnA qna;
    int index;
    // ArrayList<String> questarr;

    public Quiz() {
        randomQuestion = new Random();
        qna = new QnA();

    }

    public String getRandomQuestion() {
        int index = randomQuestion.nextInt(qna.getListQuestion().size());
        String quest = qna.getListQuestion().get(index);
        return quest;
    }

    public int getIndex() {
        return index;
    }

    public String getAnswer() {
        return qna.getListAnswer().get(index);
    }
}