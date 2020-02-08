package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = true;
        int result = condition ? left : right;
        return result;
    }

    public static int max1(int left, int right) {
        boolean condition = true;
        int result = condition ? right : left;
        return result;
    }
    public static int max2(int left, int right) {
        boolean condition = true;
        int result = condition ? left : right;
        return result;
    }
}
