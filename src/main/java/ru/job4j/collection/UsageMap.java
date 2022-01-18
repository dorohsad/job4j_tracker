package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("aa@mail.ru", "Ivanov A A");
        map.put("bb@mail.ru", "Ivanov B B");
        map.put("cc@mail.ru", "Ivanov C C");
        for (String key : map.keySet()) {
            System.out.println(map.get(key) + ": " + key);
        }
    }
}
