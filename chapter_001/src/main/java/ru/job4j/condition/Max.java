package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left > right;
        return condition ? left : right;
    }

    public static double add(double first, double second) {
        return first + second;
    }

    public static double add(double first, double second, double third) {
        double tmp = add(second, third);
        return add(first, tmp);
    }

    public static double add(double first, double second, double third, double fourth) {
        double tmp = add(second, third, fourth);
        return add(first, tmp);
    }
}
