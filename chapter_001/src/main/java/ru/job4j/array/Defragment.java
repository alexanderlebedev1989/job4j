package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;

                while (point < array.length) {
                    if (array[point] != null) {
                        String temp = array[point];
                        array[point] = array[index];
                        array[index] = temp;
                        break;
                    }
                    point++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] array = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(array);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}