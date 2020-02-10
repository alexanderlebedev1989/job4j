package ru.job4j.condition;

public class SqMax {
    private static int result;

    public static int max(int first, int second, int third, int forth) {
        if ((first > second) && (first > third) && (first > forth)) {
            result = first;
        } else if ((second > first) && (second > third) && (second > forth)) {
            result = second;
        } else if ((third > first) && (third > second) && (third > forth)) {
            result = third;
        } else if ((forth > first) && (forth > second) && (forth > third)) {
            result = forth;
        }
        return result;
    }
}

        