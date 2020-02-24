package ru.job4j.array;

public class SameNumbers {
    public static void main(String[] args) {
        int[] array1 = new int[] {1, 2, 3, 4, 5};
        int[] array2 = new int[] {2, 7, 4, 9, 1};
        for (int value : array1) {
            for (int i : array2) {
                if (value == i) {
                    System.out.println(value + " ");
                }
            }
        }
    }
}
