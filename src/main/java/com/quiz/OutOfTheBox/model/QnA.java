package com.quiz.OutOfTheBox.model;

import java.io.*;
import java.util.*;

public class QnA {

    BufferedReader br;
    private ArrayList<String> listQuestion = new ArrayList<String>();
    private ArrayList<String> listAnswer = new ArrayList<String>();
    private String[] line;
    private ArrayList<String[]> listQnA = new ArrayList<>();
    private ArrayList<String[]> listHint = new ArrayList<>();

    public QnA() {
        readFileQnA();
    }

    public ArrayList<String[]> getListQnA() {
        return listQnA;
    }

    public ArrayList<String[]> getListHint() {
        return listHint;
    }

    public void readFileQnA() {
        try {
            br = new BufferedReader(new FileReader("src/main/java/com/quiz/OutOfTheBox/model/qna.txt"));
            String txt = br.readLine();
            while (txt != null) {
                line = txt.strip().split(";");
                listQnA.add(line);
                txt = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}