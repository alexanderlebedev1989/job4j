package ru.job4j.array;

public class SameNumbers {
    public static void main(String[] args) {
        int[] array1 = new int[] {1, 2, 3, 4, 5};
        int[] array2 = new int[] {2, 7, 4, 9, 1};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i] + " ");
                }
            }
        }
    }
}
