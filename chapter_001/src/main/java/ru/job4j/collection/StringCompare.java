package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int index = 0;
        char iLeft = left.charAt(index);
        char iRight = right.charAt(index);
        int sort = Integer.compare(iLeft, iRight);
        if (sort == 0) {
            int length = Math.min(left.length(), right.length());
            for (index = 0; index < length; index++) {
                if (iLeft != iRight) {
                   sort = Integer.compare(iLeft, iRight);
                   break;
                }
                index++;
                iLeft = left.charAt(index);
                iRight = right.charAt(index);
            }
            sort = Integer.compare(left.length(), right.length());
        }
        return sort;
        }
    }
