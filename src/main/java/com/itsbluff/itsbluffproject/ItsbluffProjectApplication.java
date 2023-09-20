package com.itsbluff.itsbluffproject;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itsbluff.itsbluffproject.controllers.InsertLetterController;
import com.itsbluff.itsbluffproject.dto.WordDto;
import com.itsbluff.itsbluffproject.model.Player;
import com.itsbluff.itsbluffproject.model.UserChoices;
import com.itsbluff.itsbluffproject.services.WordValidateService;
import com.itsbluff.itsbluffproject.view.InitialCharacter;
import com.itsbluff.itsbluffproject.view.InputPlayers;
import com.itsbluff.itsbluffproject.view.UserInteraction;
import com.itsbluff.itsbluffproject.view.WordValidateView;

@SpringBootApplication
public class ItsbluffProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItsbluffProjectApplication.class, args);

		Scanner sc = new Scanner(System.in);
		char[] charArray = new char[10];
		UserChoices userChoices = new UserChoices();
		String word = new String();
		WordDto wordValidate = new WordDto();

		// Start the game
		System.out.println("Press ENTER to start");
		sc.nextLine();


		// Random character will be showed
		String randomInicialCharacter = InitialCharacter.RandomInicialCharacter();
		word = word + randomInicialCharacter;

		// Calling the player options
		do {
			System.out.print("\033c");//clear screen
			System.out.println(word);
			userChoices = UserInteraction.playerOptions();
			word = InsertLetterController.insertLetterOnSide(userChoices, word);
			wordValidate = WordValidateService.getWord(word);
			WordValidateView.wordFound(wordValidate);
		} while (wordValidate ==null || wordValidate.getWord() == null);
	}
}
