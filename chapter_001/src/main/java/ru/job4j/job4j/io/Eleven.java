package ru.job4j.job4j.io;
import java.util.Scanner;

public class Eleven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int s = 11;
        while (run) {
            System.out.println("Ходит первый игрок");
            int first = Integer.valueOf(input.nextLine());
            s = s - first;
            if (s <= 0) {
                System.out.println("Выиграл первый игрок");
                run = false;
                break;
            }
            System.out.println("Осталость " + s);
            System.out.println("Ходит второй игрок");
            int second = Integer.valueOf(input.nextLine());
            s = s - second;
            System.out.println("Осталось " + s);
            if (s <= 0) {
                System.out.println("Выиграл второй игрок");
                run = false;
                break;
            }
        }
    }
}
