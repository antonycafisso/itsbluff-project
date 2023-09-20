package com.itsbluff.itsbluffproject.model;

public class UserChoicesModel {
    private String side;
    private String letter;

    public UserChoicesModel(){

    }

    public UserChoicesModel(String side, String letter) {
        this.side = side;
        this.letter = letter;
    }

    public String getSide() {
        return side;
    }
    public void setSide(String side) {
        this.side = side;
    }
    public String getLetter() {
        return letter;
    }
    public void setLetter(String letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return this.side + this.letter;
    }
}
