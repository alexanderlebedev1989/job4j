package ru.job4j.job4j.io;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Eleven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = 11;
        while (true) {
            System.out.println("Игра 11");
            System.out.println("Чтобы первый игрок сделал ход, нажмите 1.");
            System.out.println("Чтобы второй игрок сделал ход, нажмите 2.");
            int player = Integer.valueOf(input.nextLine());
            if (player == 1) {
                System.out.println("Ходит первый игрок. Введите число от 1 до 3.");
            } else if (player == 2) {
                System.out.println("Ходит второй игрок.Введите число от 1 до 3.");
            }
            int number = Integer.valueOf(input.nextLine());
            s = s - number;
            if (s <= 0 && player == 1) {
                System.out.println("Выиграл первый игрок");
                break;
            } else if (s <= 0 && player == 2) {
                System.out.println("Выиграл второй игрок");
                break;
            }
            System.out.println("Осталость " + s);
            System.out.println();
        }
    }
}
