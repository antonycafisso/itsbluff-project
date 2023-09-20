package com.itsbluff.itsbluffproject.view;

import java.util.Scanner;

import com.itsbluff.itsbluffproject.controllers.GameController;
import com.itsbluff.itsbluffproject.model.GameModel;
import com.itsbluff.itsbluffproject.model.UserChoicesModel;

public class UserInteractionView {
    public static UserChoicesModel playerOptions(String word) {
        Scanner sc = new Scanner(System.in);
        String side = new String();
        String letter = new String();
        int option = 0;
        UserChoicesModel userChoices = new UserChoicesModel(side, letter);
        GameModel gameModel = new GameModel();
		GameController gameController = new GameController(gameModel);
		GameView gameView = new GameView(gameController);


        // Player options
        gameView.displayCurrentPlayer();// print the current player
        gameView.displayCurrentWord(word);
        System.out.println("\n\n1 INSERT A NEW LETTER");
        System.out.println("2 IT'S BLUFF");
        System.out.println("3 GIVE UP");
        System.out.print("\nOption: ");
        option = sc.nextInt();

        switch (option) {
            case 1:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Choose one letter? Ex(A,B,C,D)");
                letter = sc.next();
                System.out.println("On the right or left side? R/L");
                side = sc.next();
                userChoices = new UserChoicesModel(side, letter);
                break;
            case 3:
                userChoices = null;
                break;
            default:
                break;
        }
        gameController.makeMove(); // switch player time
        return userChoices;
    }
}
