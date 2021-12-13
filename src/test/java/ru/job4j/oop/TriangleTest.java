package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenTriangleExistThenEight() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        int expected = 8;
        assertEquals(expected, triangle.area(), 0.01);
    }

    @Test
    public void whenTriangleNotExistThenMinusOne() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 0);
        Point c = new Point(-1, 0);
        Triangle triangle = new Triangle(a, b, c);
        double expected = -1;
        assertEquals(expected, triangle.area(), 0.01);
    }
}