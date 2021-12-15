package ru.job4j.inheritance;

public class Builder extends Engineer {
    private boolean isBricklayer;

    public Builder(String name, String surname, String education, String birthday, boolean isBricklayer) {
        super(name, surname, education, birthday);
        this.isBricklayer = isBricklayer;
    }

    public void learnBricklayer() {
        this.isBricklayer = true;
    }
}
