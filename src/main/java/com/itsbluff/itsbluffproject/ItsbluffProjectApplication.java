package com.itsbluff.itsbluffproject;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itsbluff.itsbluffproject.controllers.InsertLetterController;
import com.itsbluff.itsbluffproject.dto.WordDto;
import com.itsbluff.itsbluffproject.model.PlayerModel;
import com.itsbluff.itsbluffproject.model.UserChoicesModel;
import com.itsbluff.itsbluffproject.services.WordValidateService;
import com.itsbluff.itsbluffproject.view.InitialCharacterView;
import com.itsbluff.itsbluffproject.view.PlayerView;
import com.itsbluff.itsbluffproject.view.UserInteractionView;
import com.itsbluff.itsbluffproject.view.WordValidateView;

@SpringBootApplication
public class ItsbluffProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItsbluffProjectApplication.class, args);

		Scanner sc = new Scanner(System.in);
		char[] charArray = new char[10];
		UserChoicesModel userChoices = new UserChoicesModel();
		String word = new String();
		WordDto wordValidate = new WordDto();
		PlayerModel playerModel1 = new PlayerModel(1, 5);
		PlayerModel playerModel2 = new PlayerModel(2, 5);
		PlayerView playerView = new PlayerView(playerModel1, playerModel2);
		
		// Start the game
		System.out.println("Press ENTER to start");
		sc.nextLine();

		// Random character will be showed
		String randomInicialCharacter = InitialCharacterView.RandomInicialCharacter();
		word = word + randomInicialCharacter;

		// Calling the player options

		do {
			System.out.print("\033c");// clear screen
			WordValidateView.wordFound(wordValidate);// return Word found or not
			playerView.displayPlayerPoints();// Display players and their points
			userChoices = UserInteractionView.playerOptions(word);// Player options
			word = InsertLetterController.insertLetterOnSide(userChoices, word);// Insert letter from controller
			wordValidate = WordValidateService.getWord(word);// Word valide, if this word exist or not in dictionary
			System.out.println(wordValidate);
		} while (wordValidate == null || wordValidate.getWord() == null);
	}
}
