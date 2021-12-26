package ru.job4j.poly;

public class Bus implements Transport {
    private double priceFuel = 5.0;

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
}
