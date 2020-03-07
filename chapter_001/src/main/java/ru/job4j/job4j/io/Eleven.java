package ru.job4j.job4j.io;
import java.util.Scanner;

public class Eleven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = 11;
        boolean isFinished = false;
        while (!isFinished) {
            System.out.println("Игра 11");
            System.out.println("Введите число от одного до трёх");
            int number = Integer.valueOf(input.nextLine());
            s = s - number;
            if (s == 0) {
                System.out.println("Игра закончена");
                isFinished = true;
            } else {
            System.out.println("Осталость " + s);
            System.out.println();
            }
        }
    }
}
