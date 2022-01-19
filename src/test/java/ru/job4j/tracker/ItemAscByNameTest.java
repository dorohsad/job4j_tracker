package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class ItemAscByNameTest {

    @Test
    public void compareAsc() {
        List<Item> items = Arrays.asList(
                new Item("AAA"),
                new Item("BBB"),
                new Item("ABC")
        );
        List<Item> expected = Arrays.asList(
                new Item("AAA"),
                new Item("ABC"),
                new Item("BBB")
        );
        items.sort(new ItemAscByName());
        assertArrayEquals(expected.toArray(), items.toArray());
    }

    @Test
    public void compareDesc() {
        List<Item> items = Arrays.asList(
                new Item("AAA"),
                new Item("BBB"),
                new Item("ABC")
        );
        List<Item> expected = Arrays.asList(
                new Item("BBB"),
                new Item("ABC"),
                new Item("AAA")
        );
        items.sort(new ItemDescByName());
        assertArrayEquals(expected.toArray(), items.toArray());
    }
}