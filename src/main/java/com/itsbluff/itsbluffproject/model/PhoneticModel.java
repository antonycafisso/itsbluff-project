package com.itsbluff.itsbluffproject.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PhoneticModel {
    @JsonProperty("audio")
    private String audio;

    @JsonProperty("text")
    private String text;

    @JsonProperty("sourceUrl")
    private String sourceUrl;

    @JsonProperty("license")
    private LicenseModel license;

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public LicenseModel getLicense() {
        return license;
    }

    public void setLicense(LicenseModel license) {
        this.license = license;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Audio: ").append(audio).append("\n");
        return stringBuilder.toString();
    }

    
}
