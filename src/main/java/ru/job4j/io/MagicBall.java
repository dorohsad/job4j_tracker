package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String question = input.nextLine();
        int answer = new Random().nextInt(3);
        if (0 == answer) {
            System.out.println("Да");
        } else if (1 == answer) {
            System.out.println("Нет");
        } else {
            System.out.println("Может быть");
        }
    }
}
