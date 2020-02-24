package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        boolean condition = first > second;
        int result = condition ? first : second;
        return result > third ? result : third;
    }
}
