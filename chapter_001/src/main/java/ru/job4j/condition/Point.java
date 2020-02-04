package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;
        double first = Math.pow(x, 2);
        double second = Math.pow(y, 2);
        double a = first + second;
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        double result = Point.distance(0,0,2,0);
        double resultTwo = Point.distance(1,2,0,3);
        double resultThree= Point.distance(0,3,-1,-5);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("resultTwo (1, 2) to (0, 3) " + resultTwo);
        System.out.println("resultThree (0, 3) to (-1, -5) " + resultThree);
    }
}
