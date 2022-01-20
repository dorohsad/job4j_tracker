package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class OrderConvertTest {

    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        Order order = new Order("3sfe", "Dress");
        orders.add(order);
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertEquals(order, map.get("3sfe"));
    }

    @Test
    public void whenThereAreDuplicates() {
        Order order = new Order("3sfe", "Dress");
        Order orderDuplicate = new Order("3sfe", "Dress");
        List<Order> orders = Arrays.asList(order, orderDuplicate);
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertEquals(1, map.size());
        assertSame(orderDuplicate, map.get("3sfe"));
    }
}