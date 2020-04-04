package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
    List<Integer> collect(Integer[][] order) {
        return Stream.of(order).flatMap(Arrays::stream).collect(Collectors.toList());
    }
}
