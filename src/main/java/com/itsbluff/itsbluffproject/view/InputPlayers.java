package com.itsbluff.itsbluffproject.view;

import java.util.Scanner;

import com.itsbluff.itsbluffproject.model.Player;

public class InputPlayers {

    public static void getPlayersName() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name Player 1: ");
        String name1 = sc.nextLine();

        System.out.println("Enter name Player 2: ");
        String name2 = sc.nextLine();

        Player player1 = new Player(0, name1);
        Player player2 = new Player(1, name2);
    }
}
