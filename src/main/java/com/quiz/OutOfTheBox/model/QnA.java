package com.quiz.OutOfTheBox.model;

import java.io.*;
import java.util.*;


class QnA {

    BufferedReader br;
    private ArrayList<String> listQuestion = new ArrayList<String>();
    private ArrayList<String> listAnswer = new ArrayList<String>();

    public ArrayList<String> getListAnswer() {
        return listAnswer;
    }

    public ArrayList<String> getListQuestion() {
        return listQuestion;
    }

    public void readFileQuestion(){
        try{
            br = new BufferedReader(new FileReader("question.txt"));
            String txt = br.readLine();
    
            while(txt != null){
                System.out.println(txt);
                listQuestion.add(txt);
                txt = br.readLine();
            }
        } catch(IOException e){
            e.printStackTrace();
        }System.out.println(listQuestion);
        
    }

    public void readFileAnswer(){
        try{
            br = new BufferedReader(new FileReader("answer.txt"));
            String txt = br.readLine();
    
            while(txt != null){
                listAnswer.add(txt);
                txt = br.readLine();
            }
    
            System.out.println(listAnswer);
        } catch(IOException e){
            e.printStackTrace();
        }
        
    }
    public static void main(String[] args) {
        QnA q = new QnA();
        q.getListAnswer();
    }
}