package ru.job4j.calculator;

/**
 * Class Класс для вычисления арифметических операций + - * / ^.
 * @author lebedev
 * @since 12.02.2020
 */

public class Calculator {
    public static void add(int first, int second) {
        int result = first + second;
        System.out.println(first + " + " + second + " = " + result);
    }

    public static void div(int first, int second) {
        int result = first / second;
        System.out.println(first + " / " + second + " = " + result);
    }

    public static void multiply(int first, int second) {
        int result = first * second;
        System.out.println(first + " * " + second + " = " + result);
    }

    public static void subtract(int first, int second) {
        int result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    /**
     * Main. Метод осуществляет операции сложения, деления, умножения и вычитания.
     * @param args - args
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}
