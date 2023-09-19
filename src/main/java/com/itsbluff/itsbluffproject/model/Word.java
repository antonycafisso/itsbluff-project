package com.itsbluff.itsbluffproject.model;

public class Word {
    private String word;
    private String audio;
    private String meaning;
    private String example;
    private String[] synonyms;

    public Word(){

    }

    public Word(String word, String audio, String meaning, String example, String[] synonyms) {
        this.word = word;
        this.audio = audio;
        this.meaning = meaning;
        this.example = example;
        this.synonyms = synonyms;
    }

    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public String getAudio() {
        return audio;
    }
    public void setAudio(String audio) {
        this.audio = audio;
    }
    public String getMeaning() {
        return meaning;
    }
    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }
    public String getExample() {
        return example;
    }
    public void setExample(String example) {
        this.example = example;
    }
    public String[] getSynonyms() {
        return synonyms;
    }
    public void setSynonyms(String[] synonyms) {
        this.synonyms = synonyms;
    }

}
