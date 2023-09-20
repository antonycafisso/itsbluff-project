package com.itsbluff.itsbluffproject.view;

import org.springframework.web.client.HttpClientErrorException;

import com.itsbluff.itsbluffproject.dto.WordDto;

public class WordValidateView {
    public static void wordFound(WordDto wordValidate) {
        WordDto[] wordDtos;
        try {
            if (wordValidate == null || wordValidate.getWord() == null) {
                System.out.println("WORD NOT FOUND");
            } else {
                System.out.println("\n\nWORD FOUND!!");
            }
        } catch (HttpClientErrorException.NotFound e) {
            System.out.println("WORD NOT FOUND");
        }
    }
}
