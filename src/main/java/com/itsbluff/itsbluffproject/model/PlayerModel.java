package com.itsbluff.itsbluffproject.model;

public class PlayerModel {
    private int index;
    private String score;

    public PlayerModel(){

    }

    public PlayerModel(int index, String name) {
        this.index = index;
        this.score = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public PlayerModel(String name) {
        this.score = name;
    }

    public String getName() {
        return score;
    }

    public void setName(String name) {
        this.score = name;
    }
}
