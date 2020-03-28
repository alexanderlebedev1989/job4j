package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int index = 0;
        String[] iLeft = left.split(". ");
        String[] iRight = right.split(". ");
        String iL = iLeft[index];
        String iR = iRight[index];
        int leftNew = Integer.parseInt(iL);
        int rightNew = Integer.parseInt(iR);
        return Integer.compare(leftNew, rightNew);
    }
}
