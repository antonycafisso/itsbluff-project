package com.itsbluff.itsbluffproject.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.itsbluff.itsbluffproject.model.Player;

public class InputPlayers {

    public static List<Player> getPlayersName() {
        Scanner sc = new Scanner(System.in);
        List<Player> playersList = new ArrayList<>(2);

        System.out.println("Enter name Player 1: ");
        String name1 = sc.nextLine();

        System.out.println("Enter name Player 2: ");
        String name2 = sc.nextLine();

        Player player1 = new Player(0, name1);
        Player player2 = new Player(1, name2);

        playersList.add(player1);
        playersList.add(player2);

        return playersList;
    }
}
