package com.itsbluff.itsbluffproject;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import com.itsbluff.itsbluffproject.services.WordValidateService;
import com.itsbluff.itsbluffproject.view.InitialCharacterView;
import com.itsbluff.itsbluffproject.view.UserInteraction;
import com.itsbluff.itsbluffproject.controllers.InsertLetterController;
import com.itsbluff.itsbluffproject.dto.WordDto;
import com.itsbluff.itsbluffproject.model.UserChoices;
import com.itsbluff.itsbluffproject.model.Word;

@SpringBootTest
class ItsbluffProjectApplicationTests {		
	
	public static void main(String[] args) {
		SpringApplication.run(ItsbluffProjectApplication.class, args);

		Scanner sc = new Scanner(System.in);
		char[] charArray = new char[10];
		UserChoices userChoices = new UserChoices();
		String word = new String("hello");
		WordValidateService wordValidateService = new WordValidateService();

		// Start the game
		System.out.println("Press ENTER to start");
		sc.nextLine();

		// Calling the player options
		
		WordDto foundWord = WordValidateService.getWord(word);
		System.out.println(foundWord.toString());
	}
}
