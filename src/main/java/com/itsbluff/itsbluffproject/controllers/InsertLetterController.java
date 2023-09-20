package com.itsbluff.itsbluffproject.controllers;

import com.itsbluff.itsbluffproject.model.UserChoicesModel;

public class InsertLetterController {
        public static String insertLetterOnSide(UserChoicesModel userChoices, String word) {
        String leftSide = "L";
        String rightSide = "R";
        String result = new String();
        if (leftSide.compareToIgnoreCase(userChoices.getSide()) == 0) {
            result = userChoices.getLetter() + word;
        } else if (rightSide.compareToIgnoreCase(userChoices.getSide()) == 0) {
            result = word + userChoices.getLetter() ;
        }
        return result;
    }
}
