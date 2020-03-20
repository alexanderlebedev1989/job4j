package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        Fact fact = new Fact();
        System.out.println(fact.calc(4));
    }

    public static int calc(int n) {
        int rsl = 1;
        if (n < 1) {
          throw new IllegalArgumentException("value (n) must be less than 1");
        }
        for (int index = 1; index != n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
