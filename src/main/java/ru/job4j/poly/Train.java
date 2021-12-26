package ru.job4j.poly;

public class Train implements Vehicle {
    private double cost = 2;

    @Override
    public void move() {
        System.out.println("Трогаемся!");
    }

    @Override
    public double profit(int passenger) {
        return cost * passenger;
    }
}
