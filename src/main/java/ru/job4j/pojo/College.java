package ru.job4j.pojo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class College {
    public static void main(String[] args) {
        Student alex = new Student();
        alex.setName("Алексей Иванович Иванов");
        alex.setGroup("АА-21");
        alex.setReceiptDate(LocalDate.of(2020, 6, 1));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        System.out.println("Студент " + alex.getName() + " принят "
                + alex.getReceiptDate().format(formatter) + "г. в группу " + alex.getGroup());
    }
}
