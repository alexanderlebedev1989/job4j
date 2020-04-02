package ru.job4j.lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDiapason {
    List<Double> diapason(int start, int finish, Function<Double, Double> function) {
        List<Double> list = new ArrayList<>();
        for (double i = start; i < finish; i++) {
            double x = function.apply(i);
            list.add(x);
        }
        return list;
    }
}