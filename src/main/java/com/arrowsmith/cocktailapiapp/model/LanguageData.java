package com.arrowsmith.cocktailapiapp.model;

import java.util.Objects;

public class LanguageData {

    public static final String ENGLISH_ICON = "https://img.icons8.com/?size=512&id=n5cRfdV5J7nI&format=png";
    public static final String FRENCH_ICON = "https://img.icons8.com/?size=512&id=1PjSlP5VQF71&format=png";
    public static final String SPANISH_ICON = "https://img.icons8.com/?size=512&id=PqPbL71WdPiX&format=png";
    public static final String GERMAN_ICON = "https://img.icons8.com/?size=512&id=PEPe9YoyNSe6&format=png";
    public static final String ITALIAN_ICON = "https://img.icons8.com/?size=512&id=6QSlwHlcIbQk&format=png";

    public LanguageData() {}

    public LanguageData(String language, String languageAbbreviated, String iconUrl) {
        this.language = language;
        this.languageAbbreviated = languageAbbreviated;
        this.iconUrl = iconUrl;
    }

    public static LanguageData englishData() {
        return new LanguageData("English", "EN", ENGLISH_ICON);
    }
    public static LanguageData frenchData() {
        return new LanguageData("Français", "FR", FRENCH_ICON);
    }
    public static LanguageData germanData() {
        return new LanguageData("Deutsch", "DE", GERMAN_ICON);
    }
    public static LanguageData spanishData() {
        return new LanguageData("Español", "ES", SPANISH_ICON);
    }
    public static LanguageData italianData() {
        return new LanguageData("Italiano", "IT", ITALIAN_ICON);
    }


    private String language;
    private String languageAbbreviated;
    private String iconUrl;


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguageAbbreviated() {
        return languageAbbreviated;
    }

    public void setLanguageAbbreviated(String languageAbbreviated) {
        this.languageAbbreviated = languageAbbreviated;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LanguageData that = (LanguageData) o;
        return Objects.equals(language, that.language) && Objects.equals(languageAbbreviated, that.languageAbbreviated) && Objects.equals(iconUrl, that.iconUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(language, languageAbbreviated, iconUrl);
    }
}
