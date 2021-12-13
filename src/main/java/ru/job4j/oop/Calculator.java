package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    private static int minus(int z) {
        return z - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int b) {
        return sum(b) + multiply(b) + minus(b) + divide(b);
    }

    public static void main(String[] args) {
        int sum = sum(10);
        System.out.println(sum);
        int minus = minus(10);
        System.out.println(minus);
        Calculator calculator = new Calculator();
        int multi =  calculator.multiply(5);
        System.out.println(multi);
        int div = calculator.divide(11);
        System.out.println(div);
        int sumAll = calculator.sumAllOperation(10);
        System.out.println(sumAll);
    }
}
