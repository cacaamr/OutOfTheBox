package com.quiz.OutOfTheBox.model;

import java.io.*;
import java.util.*;

public class QnA {

    BufferedReader br;
    private ArrayList<String> listQuestion = new ArrayList<String>();
    private ArrayList<String> listAnswer = new ArrayList<String>();

    public QnA() {
        readFileQuestion();
        readFileAnswer();
    }

    public ArrayList<String> getListAnswer() {
        return listAnswer;
    }

    public ArrayList<String> getListQuestion() {
        return listQuestion;
    }

    public void readFileQuestion() {
        try {
            br = new BufferedReader(new FileReader("src/main/java/com/quiz/OutOfTheBox/model/question.txt"));
            String txt = br.readLine();

            while (txt != null) {
                listQuestion.add(txt);
                txt = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readFileAnswer() {

        try {
            br = new BufferedReader(new FileReader("src/main/java/com/quiz/OutOfTheBox/model/answer.txt"));
            String txt = br.readLine();

            while (txt != null) {
                listAnswer.add(txt);
                txt = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}