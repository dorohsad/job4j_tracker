package ru.job4j.inheritance;

public class Builder extends Engineer {
    private boolean isBricklayer;

    public Builder(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
    }

    public void learnBricklayer() {
        this.isBricklayer = true;
    }
}
