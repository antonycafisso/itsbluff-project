package com.itsbluff.itsbluffproject.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.itsbluff.itsbluffproject.model.Word;

@RestController
@RequestMapping("consulting-word")
public class WordValidateService {

    @GetMapping("{word}")
    public static Word getWord(@PathVariable("word") String word) {
        Word wordReturn = new Word();

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Word> resp =  restTemplate.getForEntity("https://api.dictionaryapi.dev/api/v2/entries/en/",Word.class);
        return resp.getBody();
    }
}
