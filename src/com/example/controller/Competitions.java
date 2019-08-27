package com.example.controller;

import com.example.model.Player;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Competitions {
    public static void play(String path) throws IOException {
        Player player;
        List<Player> playerList = new LinkedList<>();
        String result;
        do {
            result = getResult().toLowerCase();
            if (!("stop".equals(result))) {
                player = getPlayer(Integer.parseInt(result));
                playerList.add(player);
            } else {
                break;
            }
        } while (true);

        Collections.sort(playerList);
        writeResult(playerList, path);
        System.out.println("Dane posortowano i zapisano do pliku stats.csv.");
    }

    private static void writeResult(List<Player> playerList, String path) throws IOException {
        BufferedWriter file = new BufferedWriter(new FileWriter(path));

        for (Player p : playerList) {
            file.write(p.getFirstName() + ";" + p.getLastName() + ";" + p.getResult() + ";");
            file.newLine();
        }
        file.close();
    }

    private static String getResult() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wynik kolejnego gracza (lub stop):");
        return input.nextLine();
    }

    private static Player getPlayer(int result) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imię:");
        String firstName = input.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = input.nextLine();
        Player player = new Player(firstName, lastName, result);
        return player;
    }
}
