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
            br = new BufferedReader(new FileReader("/Users/maishaaameerarifani/Desktop/OutOfTheBox/src/main/java/com/quiz/OutOfTheBox/model/question.txt"));
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
            br = new BufferedReader(new FileReader("/Users/maishaaameerarifani/Desktop/OutOfTheBox/src/main/java/com/quiz/OutOfTheBox/model/answer.txt"));
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



    // public void listQnA() throws IOException{
    //     // try{
    //         BufferedReader br = new BufferedReader(new FileReader("E:\\qna.txt"));
    //         String txt = br.readLine();
    //         ArrayList<String> listQuestion = new ArrayList<String>();
    //         ArrayList<String> listAnswer = new ArrayList<String>();
    //         // ArrayList<String> listQna= new ArrayList<String>();
    
    //         while(txt != null){
    //             String [] listQna = txt.split("//");
    //             listQuestion.add(listQna[0]);
    //             listAnswer.add(listQna[1]);
    //             System.out.println(listQna);
    //             txt = br.readLine();
    //         }
    //     // }catch(IOException e){
    //     //     e.printStackTrace();
    //     // }catch(FileNotFoundException e){
    //     //     e.printStackTrace();
    //     // }
    // }

    // public void printzz(){
    //     String str = "HelloWorld";
    // }


    public static void main(String[] args) {
        QnA qna = new QnA();
        qna.readFileQuestion(); 
        qna.readFileAnswer();  
    }


}