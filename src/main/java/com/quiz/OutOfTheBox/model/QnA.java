package com.quiz.OutOfTheBox.model;

import java.io.*;
import java.util.*;

public class QnA {

    BufferedReader br;
    private String[] line;
    private ArrayList<String[]> listQnA = new ArrayList<>();
    

    public QnA() {
        readFileQnA();
    }


    public ArrayList<String[]> getListQnA() {
        return listQnA;
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