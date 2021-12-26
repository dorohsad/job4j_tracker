package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
    private double priceFuel = 5.0;
    private int cost = 1;

    @Override
    public void drive() {
        System.out.println("Поехали!");
    }

    @Override
    public void passengers(int passenger) {
        System.out.println("Везу " + passenger + " пассажиров");
    }

    @Override
    public double refuel(double fuel) {
        return priceFuel * fuel;
    }

    @Override
    public void move() {
        System.out.println("Выезжаем с территории автовокзала");
    }

    @Override
    public double profit(int passenger) {
        return cost * passenger;
    }
}
