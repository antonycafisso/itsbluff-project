package com.itsbluff.itsbluffproject.view;

import java.util.ArrayList;
import java.util.List;

import com.itsbluff.itsbluffproject.model.PlayerModel;

public class PlayerView {
    private List<PlayerModel> players;

    public PlayerView(PlayerModel player1, PlayerModel player2) {
        players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
    }

    public void displayPlayerPoints() {
        for(PlayerModel player : players){
            System.out.println(player);
        }
    }
}
