package com.itsbluff.itsbluffproject.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itsbluff.itsbluffproject.dto.WordDto;

@RestController
@RequestMapping("consulting-word")
public class WordValidateService {

    @GetMapping("{word}")
    public static WordDto getWord(@PathVariable("word") String word) {
        String apiUrl = "https://api.dictionaryapi.dev/api/v2/entries/en/" + word;

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<WordDto[]> response = restTemplate.getForEntity(apiUrl, WordDto[].class);

        try {
            WordDto[] wordDtos = response.getBody();
            
            if (wordDtos != null && wordDtos.length > 0) {
                return wordDtos[0];
            }
        } catch (HttpClientErrorException.NotFound e) {
            e.printStackTrace();
        }
        return new WordDto();
    }
}
