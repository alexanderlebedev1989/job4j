package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean condition = first > second;
        int result = condition ? first : second;
        int result1 = result > third ? result : third;
        return result1;
    }
}
