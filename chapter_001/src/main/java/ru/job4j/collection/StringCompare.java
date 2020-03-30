package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int sort = Integer.compare(left.length(), right.length());
            int length = Math.min(left.length(), right.length());
            for (int index = 0; index < length; index++) {
                int iLeft = left.charAt(index);
                int iRight = right.charAt(index);
                if (iLeft != iRight) {
                   sort = Integer.compare(iLeft, iRight);
                   break;
                }
            }
        return sort;
        }
    }
