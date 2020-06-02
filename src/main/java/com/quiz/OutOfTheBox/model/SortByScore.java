package com.quiz.OutOfTheBox.model;

import java.util.*;

public class SortByScore implements Comparator<Pemain> {

    public int compare(Pemain a, Pemain b) {
        return b.getSkor() - a.getSkor();
    }
}