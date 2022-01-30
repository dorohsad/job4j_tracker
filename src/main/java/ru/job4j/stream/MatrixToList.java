package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixToList {
    public static List<Integer> convert(Integer[][] matrix) {
        List<Integer[]> list = Arrays.asList(matrix);
        return list.stream().flatMap(Arrays::stream).collect(Collectors.toList());
    }
}
