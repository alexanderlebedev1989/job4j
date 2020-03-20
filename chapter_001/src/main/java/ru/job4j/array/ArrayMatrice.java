package ru.job4j.array;

public class ArrayMatrice {
    public static void main(String[] args) {
        int[][] array = new int[11][11];
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                array[i][j] = i * j;
            }
        }
            for (int i = 1; i < array.length; i++) {
                for (int j = 1; j < array.length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
