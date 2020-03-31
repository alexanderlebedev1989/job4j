package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int index = 0;
        int sort = 0;
        String[] iLeft = left.split("/");
        String[] iRight = right.split("/");
        String iL = iLeft[index];
        String iR = iRight[index];
        if (!iL.equals(iR)) {
            sort = iR.compareTo(iL);
        } else {
            sort = left.compareTo(right);
        }
        return sort;
    }
}
