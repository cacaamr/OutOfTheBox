package com.quiz.OutOfTheBox.model;

import java.io.*;
import java.util.*;

public class QnA {

    BufferedReader br;
    private ArrayList<String> listQuestion = new ArrayList<String>();
    private ArrayList<String> listAnswer = new ArrayList<String>();
    private String[] line;
    private ArrayList<String[]> listQnA = new ArrayList<>();

    public QnA() {

        readFileQnA();
    }

    public ArrayList<String> getListAnswer() {
        return listAnswer;
    }

    public ArrayList<String> getListQuestion() {
        return listQuestion;
    }

    public ArrayList<String[]> getListQnA() {
        return listQnA;
    }

    public void readFileQnA() {
        try {
            br = new BufferedReader(new FileReader("src/main/java/com/quiz/OutOfTheBox/model/qna.txt"));
            String txt = br.readLine();
            while (txt != null) {
                line = txt.split(";");
                listQnA.add(line);
                txt = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    public static void main(String[] args) {
        QnA qna = new QnA();
        System.out.println(qna.getListQnA());
    }
}