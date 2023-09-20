package com.itsbluff.itsbluffproject.dto;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.itsbluff.itsbluffproject.model.Meaning;
import com.itsbluff.itsbluffproject.model.Phonetic;

public class WordDto {
    @JsonProperty("word")
    private String word;
    @JsonProperty("phonetics")
    private List<Phonetic> phonetic;
    @JsonProperty("meanings")
    private Meaning[] meaning;
    private Boolean wordFound;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<Phonetic> getPhonetic() {
        return phonetic;
    }

    public void setPhonetic(List<Phonetic> phonetic) {
        this.phonetic = phonetic;
    }

    public Meaning[] getMeaning() {
        return meaning;
    }

    public void setMeaning(Meaning[] meaning) {
        this.meaning = meaning;
    }

    public Boolean getWordFound() {
        return wordFound;
    }

    public void setWordFound(Boolean wordFound) {
        this.wordFound = wordFound;
    }

    @Override
    public String toString() {
        int maxMeaningsToShow = 1;
        int maxAudiosToShow = 2;
        int countMeaning = 0;
        int countAudios = 0;
        StringBuilder stringBuilder = new StringBuilder();

        // Word
        stringBuilder.append("Word: ").append(word);

        // Meaning
        stringBuilder.append("\n\nMeanings:\n");
        for (Meaning meaningObj : meaning) {
            if (countMeaning >= maxMeaningsToShow) {
                break;
            }
            stringBuilder.append(meaningObj.toString()).append("\n");
            countMeaning++;
        }

        // Phonetic
        stringBuilder.append("Audios:\n");
        for (Phonetic phoneticObj : phonetic) {
            if (countAudios >= maxAudiosToShow) {
                break;
            }
            stringBuilder.append(phoneticObj.toString());
            countAudios++;
        }
        return stringBuilder.toString();
    }

}
