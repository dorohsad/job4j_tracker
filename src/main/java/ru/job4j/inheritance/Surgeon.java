package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private boolean cardiacSurgeon;

    public Surgeon(String name, String surname, String education, String birthday, boolean cardiacSurgeon) {
        super(name, surname, education, birthday);
        this.cardiacSurgeon = cardiacSurgeon;
    }

    public void learnCardiac() {
        this.cardiacSurgeon = true;
    }
}
