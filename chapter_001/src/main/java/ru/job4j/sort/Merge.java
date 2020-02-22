package ru.job4j.sort;
import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
            int l = 0;
            int r = 0;
            int c = 0;

            while (c < result.length) {
                if (l == left.length && r < right.length) {
                    result[c] = right[r++];
                } else if (r == right.length && l < left.length) {
                    result[c] = left[l++];
                } else if (l == left.length && r == right.length) {
                    break;
                } else if (left[l] < right[r]) {
                    result[c] = left[l++];
                } else if (left[l] > right[r]) {
                    result[c] = right[r++];
                } else if (left[l] == right[r]) {
                    result[c] = left[l++];
                }
            c++;
        }
        return result;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] result = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(result));
    }
}
