package ru.job4j.collection;

import java.util.Comparator;

import static java.lang.Math.min;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        char[] first = o1.toCharArray();
        char[] second = o2.toCharArray();
        int minLength = min(first.length, second.length);
        for (int i = 0; i < minLength; i++) {
            if (first[i] != second[i]) {
                return Character.compare(first[i], second[i]);
            }
        }
        return Integer.compare(first.length, second.length);
    }
}
