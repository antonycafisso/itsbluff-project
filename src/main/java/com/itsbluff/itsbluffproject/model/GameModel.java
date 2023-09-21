package com.itsbluff.itsbluffproject.model;

import java.util.ArrayList;
import java.util.List;

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
