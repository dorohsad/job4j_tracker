package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class OrderConvertTest {

    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        Order order = new Order("3sfe", "Dress");
        orders.add(order);
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertEquals(order, map.get("3sfe"));
    }
}