package ru.job4j.job4j.io;
import java.util.Scanner;

public class Eleven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = 11;
        boolean first = true;
        boolean isFinished = false;
        while (!isFinished) {
            System.out.println("Игра 11");
            System.out.println("Введите число от одного до трёх");
            if (first) {
                System.out.println("Ходит первый игрок");
                first = false;
            } else {
                System.out.println("Ходит второй игрок");
                first = true;
            }
            int number = Integer.valueOf(input.nextLine());
            s = s - number;
            if (s == 0) {
                System.out.println("Игра закончена");
                isFinished = true;
                if (!first) {
                    System.out.println("Победил первый игрок");
                } else {
                    System.out.println("Победил второй игрок");
                }
            } else {
            System.out.println("Осталость " + s);
            System.out.println();
            }
        }
    }
}
