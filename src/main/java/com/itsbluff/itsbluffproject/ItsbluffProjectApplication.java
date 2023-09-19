package com.itsbluff.itsbluffproject;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itsbluff.itsbluffproject.controllers.InsertLetterController;
import com.itsbluff.itsbluffproject.model.UserChoices;
import com.itsbluff.itsbluffproject.model.Word;
import com.itsbluff.itsbluffproject.services.WordValidateService;
import com.itsbluff.itsbluffproject.view.InitialCharacter;
import com.itsbluff.itsbluffproject.view.UserInteraction;

@SpringBootApplication
public class ItsbluffProjectApplication {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[] charArray = new char[10];
		UserChoices userChoices = new UserChoices();
		String word = new String();

		// Start the game
		System.out.println("Press ENTER to start");
		sc.nextLine();

		// Random character will be showed
		String randomInicialCharacter = InitialCharacter.RandomInicialCharacter();
		System.out.printf("\nInitial Letter: \n\n " + randomInicialCharacter);
		word = word + randomInicialCharacter;

		// Calling the player options
		do {
			userChoices = UserInteraction.playerOptions();
			word = InsertLetterController.insertLetterOnSide(userChoices, word);
			Word foundWord = WordValidateService.getWord(word);
			System.out.println("\n\nWORD:\n\n");
			System.out.println(word);
		} while (userChoices != null);
	}
}
