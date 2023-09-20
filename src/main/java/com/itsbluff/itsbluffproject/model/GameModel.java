package com.itsbluff.itsbluffproject.model;

public class GameModel {
    private int currentPlayerIndex;

    public GameModel(){
        currentPlayerIndex = 0;
    }

    public int getCurrentPlayerIndex(){
        return currentPlayerIndex;
    }

    public void switchPlayer(){
        currentPlayerIndex = (currentPlayerIndex + 1) % 2;
    }
}
