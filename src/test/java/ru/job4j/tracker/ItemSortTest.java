package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class ItemSortTest {

    @Test
    public void compareAsc() {
        Item item1 = new Item("AAA");
        Item item2 = new Item("BBB");
        Item item3 = new Item("ABC");
        List<Item> items = Arrays.asList(item1, item2, item3);
        List<Item> expected = Arrays.asList(item1, item3, item2);
        items.sort(new ItemAscByName());
        assertArrayEquals(expected.toArray(), items.toArray());
    }

    @Test
    public void compareDesc() {
        Item item1 = new Item("AAA");
        Item item2 = new Item("BBB");
        Item item3 = new Item("ABC");
        List<Item> items = Arrays.asList(item1, item2, item3);
        List<Item> expected = Arrays.asList(item2, item3, item1);
        items.sort(new ItemDescByName());
        assertArrayEquals(expected.toArray(), items.toArray());
    }
}