package ru.job4j.job4j.io;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Eleven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int s = 11;
        while (run) {
            System.out.println("Первый игрок возьмите спички");
            int first = Integer.valueOf(input.nextLine());
            if (first == 0 || first > 3) {
                System.out.println("Уважаемый! Можно от 1 до 3. Попробуй снова.");
                int first1 = Integer.valueOf(input.nextLine());
                s = s - first1;
                System.out.println("Осталось " + s);
            } else {
                s = s - first;
                System.out.println("Осталось " + s);
            }
                System.out.println();

            if (s == 0) {
                System.out.println("Первый игрок победил");
                run = false;
            } else {
                System.out.println("Второй игрок возьмите спички");
            }
            int second = Integer.valueOf(input.nextLine());
            if (second == 0 || second > 3) {
                System.out.println("Уважаемый! Можно от 1 до 3. Попробуй снова.");
                int second1 = Integer.valueOf(input.nextLine());
                s = s - second1;
                System.out.println("Осталось " + s);
            } else {
                s = s - second;
                System.out.println("Осталось " + s);
            }
            if (s == 0) {
                System.out.println("Второй игрок победил");
                run = false;
            } else {
                System.out.println();
            }
        }
    }
}
