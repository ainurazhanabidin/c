package com.company;

import java.util.Arrays;

public class Class {
    private int number;
    private String words;
    private int[] massive;

    public Class() {
    }

    public Class(int number, String words, int[] massiv) {
        this.number = number;
        this.words = words;
        this.massive = massiv;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public int[] getMassive() {
        return massive;
    }

    public void setMassive(int[] massive) {
        this.massive = massive;
    }

    @Override
    public String toString() {
        return "Class{" +
                "number=" + number +
                ", words='" + words + '\'' +
                ", massive=" + Arrays.toString(massive) +
                '}';
    }
}




