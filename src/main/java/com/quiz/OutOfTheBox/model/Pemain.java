package com.quiz.OutOfTheBox.model;

import java.util.ArrayList;

// class Pemain berguna untuk menyimpan data user dilengkapi dengan beberapa method 
public class Pemain {
    private static ArrayList<Pemain> daftarPemain = new ArrayList<>();
    private String nama;
    private int skor = 0  ;
    private int nyawa = 5;

    // getter untuk daftarPemain
    public static ArrayList<Pemain> getDaftarPemain() {
        return daftarPemain;
    }

    // mengembalikan pemain dari daftarPemain sesuai nama di parameter
    public static Pemain getPemain(String nama) {
        Pemain user = new Pemain();
        for (int i = 0; i < daftarPemain.size(); i++) {
            if (daftarPemain.get(i).getNama().equals(nama)) {
                user = daftarPemain.get(i);
            }
        }
        return user;
    }

    // menambahkan pemain ke daftarPemain
    public static void addPemain(Pemain pemain) {
        daftarPemain.add(pemain);
    }

    // setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // getter untuk nama
    public String getNama() {
        return this.nama;
    }

    // getter untuk skor
    public int getSkor() {
        return this.skor;
    }

    // setter untuk skor
    public void setSkor(int skor) {
        this.skor = skor;
    }

    // method untuk menambahkan skor sebanyak 10 poin
    public void tambahSkor() {
        this.skor += 10;
    }

    // getter untuk nyawa
    public int getNyawa() {
        return this.nyawa;
    }

    // method untuk mengurangi nyawa sebanyak 1
    public void kurangiNyawa() {
        this.nyawa -= 1;
    }

    // setter untuk nyawa
    public void setNyawa(int nyawa) {
        this.nyawa = nyawa;
    }

}