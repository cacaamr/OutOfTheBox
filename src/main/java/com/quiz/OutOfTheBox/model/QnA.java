package com.quiz.OutOfTheBox.model;

import java.io.*;
import java.util.*;

public class QnA {

    public BufferedReader br;
    private ArrayList<String> listQuestion = new ArrayList<String>();
    private ArrayList<String> listAnswer = new ArrayList<String>();

<<<<<<< HEAD
    public QnA(){
        readFileAnswer();
        readFileQuestion();

    }
    
=======
    public QnA() {
        readFileQuestion();
        readFileAnswer();
    }
>>>>>>> 00cbd93f8c79a375389e405d7f803186155d233d

    public ArrayList<String> getListAnswer() {
        return listAnswer;
    }

    public ArrayList<String> getListQuestion() {
        return listQuestion;
    }

<<<<<<< HEAD
    public void readFileQuestion(){
        try{
            br = new BufferedReader(new FileReader("OutOfTheBox\\src\\main\\java\\com\\quiz\\OutOfTheBox\\model\\question.txt"));
=======
    public void readFileQuestion() {
        try {
            br = new BufferedReader(new FileReader("src/main/java/com/quiz/OutOfTheBox/model/question.txt"));
>>>>>>> 00cbd93f8c79a375389e405d7f803186155d233d
            String txt = br.readLine();

            while (txt != null) {
                listQuestion.add(txt);
                txt = br.readLine();
            }
<<<<<<< HEAD
    
            // System.out.println(listQuestion);
        } catch(IOException e){
=======
        } catch (IOException e) {
>>>>>>> 00cbd93f8c79a375389e405d7f803186155d233d
            e.printStackTrace();
        }

    }

<<<<<<< HEAD
    public void readFileAnswer(){
        try{
            br = new BufferedReader(new FileReader("OutOfTheBox\\src\\main\\java\\com\\quiz\\OutOfTheBox\\model\\question.txt"));
=======
    public void readFileAnswer() {

        try {
            br = new BufferedReader(new FileReader("src/main/java/com/quiz/OutOfTheBox/model/answer.txt"));
>>>>>>> 00cbd93f8c79a375389e405d7f803186155d233d
            String txt = br.readLine();

            while (txt != null) {
                listAnswer.add(txt);
                txt = br.readLine();
            }
<<<<<<< HEAD
    
            // System.out.println(listAnswer);
        } catch(IOException e){
            e.printStackTrace();
        }
        
    }

    Random randomQuestion = new Random();

    public String getRandomQuestion(){
        int index = randomQuestion.nextInt(getListQuestion().size());
        String quest = getListQuestion().get(index);
        // System.out.println(quest);
        //System.out.println(index);
        //System.out.println("halo " + quest);
        return quest;
    }



    public static void main(String[] args) {
        QnA qna = new QnA();
        // qna.readFileQuestion(); 
        // System.out.println(qna.getListQuestion()); 
        // qna.readFileAnswer();  
        // System.out.println(qna.getListAnswer());
        System.out.println(qna.getRandomQuestion());
    }


}
=======
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // public void listQnA() throws IOException{
    // // try{
    // BufferedReader br = new BufferedReader(new FileReader("E:\\qna.txt"));
    // String txt = br.readLine();
    // ArrayList<String> listQuestion = new ArrayList<String>();
    // ArrayList<String> listAnswer = new ArrayList<String>();
    // // ArrayList<String> listQna= new ArrayList<String>();

    // while(txt != null){
    // String [] listQna = txt.split("//");
    // listQuestion.add(listQna[0]);
    // listAnswer.add(listQna[1]);
    // System.out.println(listQna);
    // txt = br.readLine();
    // }
    // // }catch(IOException e){
    // // e.printStackTrace();
    // // }catch(FileNotFoundException e){
    // // e.printStackTrace();
    // // }
    // }

    // public void printzz(){
    // String str = "HelloWorld";
    // }

}
>>>>>>> 00cbd93f8c79a375389e405d7f803186155d233d
