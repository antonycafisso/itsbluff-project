package com.itsbluff.itsbluffproject.view;

import com.itsbluff.itsbluffproject.controllers.GameController;

public class GameView {
    private GameController gameController;

    public GameView(){

    }
    
    public GameView(GameController gameController) {
        this.gameController = gameController;
    }

    public void displayCurrentPlayer() {
        int currentPlayerIndex = gameController.getCurrentPlayerIndex();
        System.out.println("Player time: " + (currentPlayerIndex + 1));
    }

    public void displayCurrentWord(String word){
        System.out.println("\n\n" + word);
    }
}