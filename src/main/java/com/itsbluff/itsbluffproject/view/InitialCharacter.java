package com.itsbluff.itsbluffproject.view;

import java.util.Random;

public class InitialCharacter {
    public static String RandomInicialCharacter() {
        Random random = new Random();
        char RandomInicialCharacter = (char) (random.nextInt(26) + 'A');
        String mainWord = Character.toString(RandomInicialCharacter);
        return mainWord;
    }
}
