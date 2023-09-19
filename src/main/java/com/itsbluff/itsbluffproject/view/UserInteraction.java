package com.itsbluff.itsbluffproject.view;

import java.util.Scanner;

import com.itsbluff.itsbluffproject.model.UserChoices;

public class UserInteraction {
        public static UserChoices playerOptions() {
        Scanner sc = new Scanner(System.in);
        String side = new String();
        String letter = new String();
        UserChoices userChoices = new UserChoices(side, letter);

        // Player options
        System.out.println("\n\n1 INSERT A NEW LETTER");
        System.out.println("2 IT'S BLUFF");
        System.out.println("3 GIVE UP");
        System.out.print("\nOption: ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                Scanner scanner = new Scanner(System.in);
                System.out.println("Choose one letter? Ex(A,B,C,D)");
                letter = sc.next();
                System.out.println("On the right or left side? R/L");
                side = sc.next();
                userChoices = new UserChoices(side, letter);
                break;
            case 3:
                userChoices = null;
                break;
        }
        return userChoices;
    }
}
