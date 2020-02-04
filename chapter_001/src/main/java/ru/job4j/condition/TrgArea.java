package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double first = (a + b + c) / 2;
        double second = first * (first - a) * (first - b) * (first - c);
        return Math.sqrt(second);
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2,2,2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
