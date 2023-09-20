package com.itsbluff.itsbluffproject.view;

import java.util.Scanner;

import com.itsbluff.itsbluffproject.model.Player;

public class InputPlayers {

    public static void getPlayersName() {
        Scanner sc = new Scanner(System.in);
        Player player1 = new Player();
        Player player2 = new Player();

        System.out.println("Enter name Player 1: ");
        player1.setName(sc.nextLine());

        System.out.println("Enter name Player 2: ");
        player2.setName(sc.nextLine());
    }
}
