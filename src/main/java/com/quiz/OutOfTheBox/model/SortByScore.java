package com.quiz.OutOfTheBox.model;

import java.util.*;

//class SortByScore berguna untuk mengurutkan daftar pemain berdasarkan skor, dipakai di MainController
public class SortByScore implements Comparator<Pemain> {

    // method yang nantinya dipakai di bagian MainController - leaderboard
    public int compare(Pemain a, Pemain b) {
        return b.getSkor() - a.getSkor();
    }
}