package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private Language[] languages;

    public Programmer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);

    }

    public Language[] getLanguages() {
        return languages;
    }
}
