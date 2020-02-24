package ru.job4j.sort;
import java.util.Arrays;

public class Merge {
    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
            int iLeft = 0;
            int iRight = 0;
            int iResult = 0;

            while (iResult < result.length) {
                if (iLeft == left.length && iRight < right.length) {
                    result[iResult] = right[iRight++];
                } else if (iRight == right.length && iLeft < left.length) {
                    result[iResult] = left[iLeft++];
                } else if (left[iLeft] > right[iRight]) {
                    result[iResult] = right[iRight++];
                } else {
                    result[iResult] = left[iLeft++];
                }
            iResult++;
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
