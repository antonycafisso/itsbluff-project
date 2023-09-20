package com.itsbluff.itsbluffproject.controllers;

import com.itsbluff.itsbluffproject.model.GameModel;

public class GameController {
    private GameModel gameModel;

    public GameController(GameModel gameModel) {
        this.gameModel = gameModel;
    }

    public GameController(){
        gameModel = new GameModel();
    }

    public int getCurrentPlayerIndex(){
        return gameModel.getCurrentPlayerIndex();
    }

    public void makeMove(){
        gameModel.switchPlayer();
    }
}
