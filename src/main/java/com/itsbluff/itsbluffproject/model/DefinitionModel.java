package com.itsbluff.itsbluffproject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DefinitionModel {
    @JsonProperty("definition")
    private String definition;

    @JsonProperty("synonyms")
    private String[] synonyms;

    @JsonProperty("antonyms")
    private String[] antonyms;

    @JsonProperty("example")
    private String example;

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
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

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Override
    public String toString() {
        return "Definition: " + definition;
    }
    
}
