package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = false;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String stringsOrigin : origin) {
            check.add(stringsOrigin);
        }
            for (String texts : text) {
                if (check.contains(texts)) {
                    rsl = true;
                } else {
                    rsl = false;
                    break;
                }
            }
        return rsl;
    }
}

