package com.itsbluff.itsbluffproject.dto;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.itsbluff.itsbluffproject.model.MeaningModel;
import com.itsbluff.itsbluffproject.model.PhoneticModel;

public class WordDto {
    @JsonProperty("word")
    private String word;
    @JsonProperty("phonetics")
    private List<PhoneticModel> phonetic;
    @JsonProperty("meanings")
    private MeaningModel[] meaning;
    private Boolean wordFound;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<PhoneticModel> getPhonetic() {
        return phonetic;
    }

    public void setPhonetic(List<PhoneticModel> phonetic) {
        this.phonetic = phonetic;
    }

    public MeaningModel[] getMeaning() {
        return meaning;
    }

    public void setMeaning(MeaningModel[] meaning) {
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
        for (MeaningModel meaningObj : meaning) {
            if (countMeaning >= maxMeaningsToShow) {
                break;
            }
            stringBuilder.append(meaningObj.toString()).append("\n");
            countMeaning++;
        }

        // Phonetic
        stringBuilder.append("Audios:\n");
        for (PhoneticModel phoneticObj : phonetic) {
            if (countAudios >= maxAudiosToShow) {
                break;
            }
            stringBuilder.append(phoneticObj.toString());
            countAudios++;
        }
        return stringBuilder.toString();
    }

}
