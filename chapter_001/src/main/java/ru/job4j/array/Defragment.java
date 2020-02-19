package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int n = index;

                while(n <= array.length-1) {
                    if (array[n] != null) {
                        int point = n;
                        String temp = array[n];
                        array[n] = array[index];
                        array[index] = temp;
                        break;
                    }
                    n++;
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