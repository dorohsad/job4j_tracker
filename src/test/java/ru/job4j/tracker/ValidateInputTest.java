package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"one", "1"}
        );
        ValidateInput input = new ValidateInput(in, out);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenInputIsCorrectOneTime() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"2"}
        );
        ValidateInput input = new ValidateInput(in, out);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(2));
    }

    @Test
    public void whenInputIsCorrectThreeTimes() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"2", "3", "5"}
        );
        ValidateInput input = new ValidateInput(in, out);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.askInt("Enter menu:");
        }
        int[] expected = {2, 3, 5};
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void whenInputIsNegativeNumber() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[]{"-2"}
        );
        ValidateInput input = new ValidateInput(in, out);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(-2));
    }
}