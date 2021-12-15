package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private boolean isPrivate;

    public Dentist(String name, String surname, String education, String birthday, boolean isPrivate) {
        super(name, surname, education, birthday);
        this.isPrivate = isPrivate;
    }

    public void openClinic() {
        this.isPrivate = true;
    }
}
