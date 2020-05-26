package com.quiz.OutOfTheBox.model;

import java.io.*;
import java.util.*;


public class QnA {

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
            br = new BufferedReader(new FileReader("E:\\Nadin\\KULIAH SEMESTER 2\\DDP2\\PROYEK AKHIR\\OutOfTheBox\\src\\main\\java\\com\\quiz\\OutOfTheBox\\model\\question.txt"));
            String txt = br.readLine();
    
            while(txt != null){
                listQuestion.add(txt);
                txt = br.readLine();
            }
    
            System.out.println(listQuestion);
        } catch(IOException e){
            e.printStackTrace();
        }
        
    }

    public void readFileAnswer(){
        try{
            br = new BufferedReader(new FileReader("E:\\Nadin\\KULIAH SEMESTER 2\\DDP2\\PROYEK AKHIR\\OutOfTheBox\\src\\main\\java\\com\\quiz\\OutOfTheBox\\model\\answer.txt"));
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
        QnA qna = new QnA();
        qna.readFileQuestion(); 
        System.out.println(qna.getListQuestion()); 
        qna.readFileAnswer();  
        System.out.println(qna.getListAnswer());
    }


}