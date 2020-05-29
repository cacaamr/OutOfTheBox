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
        index = randomQuestion.nextInt(qna.getListQnA().size());
    }

    public String getRandomQuestion() {
        String[] que = qna.getListQnA().get(index);
        String question = que[0];
        return question;
    }

    public ArrayList<String[]> getList() {
        return qna.getListQnA();
    }

    public int getIndex() {
        return index;
    }

    public String getAnswer() {
        String[] ans = qna.getListQnA().get(index);
        String answer = ans[1];
        return answer;
    }

    public String getAnswerbyIndex(int in) {
        String jawaban = qna.getListQnA().get(in)[1];
        return jawaban;
    }
}