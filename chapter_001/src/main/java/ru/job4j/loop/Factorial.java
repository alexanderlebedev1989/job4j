package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        for (int x = 1; x <= n; x++) {
            if (n == 0) {
                result = 1;
            }
            result = result * x;
        }
        return result;
    }
}
