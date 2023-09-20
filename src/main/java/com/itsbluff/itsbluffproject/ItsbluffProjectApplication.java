package com.itsbluff.itsbluffproject;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itsbluff.itsbluffproject.controllers.InsertLetterController;
import com.itsbluff.itsbluffproject.dto.WordDto;
import com.itsbluff.itsbluffproject.model.UserChoices;
import com.itsbluff.itsbluffproject.services.WordValidateService;
import com.itsbluff.itsbluffproject.view.InitialCharacter;
import com.itsbluff.itsbluffproject.view.InputPlayers;
import com.itsbluff.itsbluffproject.view.UserInteraction;

@SpringBootApplication
public class ItsbluffProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItsbluffProjectApplication.class, args);

		Scanner sc = new Scanner(System.in);
		char[] charArray = new char[10];
		UserChoices userChoices = new UserChoices();
		String word = new String();
		WordDto foundWord = new WordDto();

		// Start the game
		System.out.println("Press ENTER to start");
		sc.nextLine();

		// Input players name
		InputPlayers.getPlayersName();

		// Random character will be showed
		String randomInicialCharacter = InitialCharacter.RandomInicialCharacter();
		System.out.printf("\nInitial Letter: \n\n " + randomInicialCharacter);
		word = word + randomInicialCharacter;

		// Calling the player options
		do {
			userChoices = UserInteraction.playerOptions();
			word = InsertLetterController.insertLetterOnSide(userChoices, word);
			foundWord = WordValidateService.getWord(word);
			System.out.println(foundWord.toString());
		} while (userChoices != null || foundWord.equals(null));
	}
}
