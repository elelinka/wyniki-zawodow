package com.example.main;

import com.example.controller.Competitions;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\grego\\Desktop\\stats.csv";
        try {
            Competitions.play(path);
        } catch (IOException e) {
            System.out.println("Nie znaleziono pliku.");
        }
    }
}
