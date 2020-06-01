package com.quiz.OutOfTheBox.model;

import java.util.ArrayList;

public class Pemain {
    private static ArrayList<Pemain> daftarPemain = new ArrayList<Pemain>();
    private String nama;
    private int skor = 0;
    private int nyawa = 5;
    protected boolean gameOver = false;

    public static ArrayList<Pemain> getDaftarPemain() {
        return daftarPemain;
    }

    public static void addPemain(Pemain pemain) {
        daftarPemain.add(pemain);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public void tambahSkor(){
    this.skor += 10;
    }

    public int getNyawa() {
        return nyawa;
    }

    public void kurangiNyawa() {

    this.nyawa--;
    }

    public void setNyawa(int nyawa) {
        this.nyawa = nyawa;
    }
}