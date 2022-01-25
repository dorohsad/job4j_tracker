package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DiapFunctionTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        DiapFunction function = new DiapFunction();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        DiapFunction function = new DiapFunction();
        List<Double> result = function.diapason(0, 3, x -> Math.pow(x, 2) + x + 1);
        List<Double> expected = Arrays.asList(1D, 3D, 7D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        DiapFunction function = new DiapFunction();
        List<Double> result = function.diapason(0, 5, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(1D, 2D, 4D, 8D, 16D);
        assertThat(result, is(expected));
    }
}