package ru.job4j.loop;

public class CheckPrimeNumber {
    private static boolean prime;

    public static boolean check(int number) {
        for (int index = 2; index <= number; index++) {
           if (number % index == 0) {
               prime = false;
               break;
           } else {
               prime = true;
               break;
             }
            }
        return prime;
    }
}
