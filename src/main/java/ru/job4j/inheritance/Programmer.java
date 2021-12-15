package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private Language[] languages;

    public Programmer(String name, String surname, String education, String birthday, Language[] languages) {
        super(name, surname, education, birthday);
        this.languages = languages;
    }

    public Language[] getLanguages() {
        return languages;
    }
}
