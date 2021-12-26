package ru.job4j.poly;

public class Plane implements Vehicle {
    private double cost = 10;

    @Override
    public void move() {
        System.out.println("Взлетаем!");
    }

    @Override
    public double profit(int passenger) {
        return cost * passenger;
    }
}
