package ru.job4j.lambda;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Function<Double, Double> function = x -> 2 * x + 1;
        System.out.println(function.apply((double) 5));
    }
}
