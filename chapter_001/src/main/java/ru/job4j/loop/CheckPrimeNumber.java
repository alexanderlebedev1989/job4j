package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = true;

        if (number < 2 || number == 9) return false;

        for (int index = 2; index < number; index++) {
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
