package com.quiz.OutOfTheBox.model;

import java.io.*;
import java.util.*;

// class QnA berguna untuk membaca file qna.txt dilengkapi dengan beberapa method
public class QnA {
    BufferedReader br;
    private String[] line;
    private ArrayList<String[]> listQnA = new ArrayList<>();
    
    // constructor untuk class QnA
    public QnA() {
        readFileQnA();
    }

    // getter untuk listQnA
    public ArrayList<String[]> getListQnA() {
        return listQnA;
    }

    // method untuk me-read file qna.txt
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