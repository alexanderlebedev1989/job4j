package ru.job4j.ex;

import java.lang.reflect.Array;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("No index with this key");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] cars = {"Porsche", "Ford", "Ferrari", "Lada"};
        FindEl el = new FindEl();
        try {
            el.indexOf(cars, "Lexus");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
