package com.quiz.OutOfTheBox.model;

import java.util.ArrayList;
import java.util.Random;

// class Quiz berguna untuk mengatur pertanyaan yang akan muncul di quiz dilengkapi dengan method lainnya
public class Quiz {
    private Random randomQuestion;
    public QnA qna;
    int index;

    // constructor untuk class Quiz
    public Quiz() {
        qna = new QnA();
        randomQuestion = new Random();
        index = randomQuestion.nextInt(qna.getListQnA().size());
    }

    // method untuk mengambil pertanyaan secara random
    public String getRandomQuestion() {
        String[] que = qna.getListQnA().get(index);
        String question = que[0];
        return question;
    }

    // method untuk mengambil hint dari pertanyaan
    public String getHint() {
        String [] listHint = qna.getListQnA().get(index);
        String hint = listHint[2];
        return hint;
    }


    // getter untuk mengambil list dari class QnA
    public ArrayList<String[]> getList() {
        return qna.getListQnA();
    }

    // getter untuk index
    public int getIndex() {
        return index;
    }

    // method untuk mengambil jawaban dari pertanyaan yang sudah di random
    public String getAnswer() {
        String[] ans = qna.getListQnA().get(index);
        String answer = ans[1];
        return answer;
    }

}