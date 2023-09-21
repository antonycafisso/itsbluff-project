package com.itsbluff.itsbluffproject.model;

public class PlayerModel {
    private int index;
    private int points = 5;

    public PlayerModel() {

    }

    public PlayerModel(int index, int points) {
        this.index = index;
        this.points = points;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public PlayerModel(int points) {
        this.points = points;
    }

    public int getpoints() {
        return points;
    }

    public void setpoints(int points) {
        this.points = points;
    }

    public void decrementPlayer1Points() {
        points = points - 1;
    }
    
    public void decrementPlayer2Points() {
        points = points - 2;
    }

    @Override
    public String toString() {
        return "Player " + index + " / Points:" + points + "";
    }

    
}
