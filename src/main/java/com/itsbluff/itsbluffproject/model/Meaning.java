package com.itsbluff.itsbluffproject.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meaning {
    @JsonProperty("partOfSpeech")
    private String partOfSpeech;

    @JsonProperty("definitions")
    private Definition[] definitions;

    @JsonProperty("synonyms")
    private String[] synonyms;

    @JsonProperty("antonyms")
    private String[] antonyms;

    public String getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(String partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public Definition[] getDefinitions() {
        return definitions;
    }

    public void setDefinitions(Definition[] definitions) {
        this.definitions = definitions;
    }

    public String[] getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(String[] synonyms) {
        this.synonyms = synonyms;
    }

    public String[] getAntonyms() {
        return antonyms;
    }

    public void setAntonyms(String[] antonyms) {
        this.antonyms = antonyms;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Part of Speech: ").append(partOfSpeech).append("\n");

        stringBuilder.append("Definitions:\n");
        for (Definition definition : definitions) {
            stringBuilder.append(definition.toString()).append("\n");
        }

        stringBuilder.append("Synonyms: ").append(Arrays.toString(synonyms)).append("\n");
        stringBuilder.append("Antonyms: ").append(Arrays.toString(antonyms)).append("\n");

        return stringBuilder.toString();
    }

}
