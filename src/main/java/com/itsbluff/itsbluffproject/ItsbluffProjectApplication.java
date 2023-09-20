package com.itsbluff.itsbluffproject;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.itsbluff.itsbluffproject.controllers.GameController;
import com.itsbluff.itsbluffproject.controllers.InsertLetterController;
import com.itsbluff.itsbluffproject.dto.WordDto;
import com.itsbluff.itsbluffproject.model.GameModel;
import com.itsbluff.itsbluffproject.model.Player;
import com.itsbluff.itsbluffproject.model.UserChoices;
import com.itsbluff.itsbluffproject.services.WordValidateService;
import com.itsbluff.itsbluffproject.view.GameView;
import com.itsbluff.itsbluffproject.view.InitialCharacterView;
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
		GameModel gameModel = new GameModel();
        GameController gameController = new GameController(gameModel);
        GameView gameView = new GameView(gameController);

		// Start the game
		System.out.println("Press ENTER to start");
		sc.nextLine();


		// Random character will be showed
		String randomInicialCharacter = InitialCharacterView.RandomInicialCharacter();
		word = word + randomInicialCharacter;

		// Calling the player options
		do {
			System.out.print("\033c");//clear screen
			gameView.displayCurrentPlayer();//print the current player
			WordValidateView.wordFound(wordValidate);// return Word found or not
			System.out.println("\n\n" + word);// print word
			userChoices = UserInteraction.playerOptions();//Player options
			word = InsertLetterController.insertLetterOnSide(userChoices, word);//Insert letter from controller
			wordValidate = WordValidateService.getWord(word);//Word valide, if this word exist or not in dictionary
			gameController.makeMove(); //switch player time
		} while (wordValidate ==null || wordValidate.getWord() == null);
	}
}
