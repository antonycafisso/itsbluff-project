package com.itsbluff.itsbluffproject.model;

public class UserChoices {
    private String side;
    private String letter;

    public UserChoices(){

    }

    public UserChoices(String side, String letter) {
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
