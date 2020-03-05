package ru.job4j.job4j.io;
import java.util.Scanner;

public class Eleven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = 11;
        while (true) {
            System.out.println("Ходит первый игрок");
            int first = Integer.valueOf(input.nextLine());
            s = s - first;
            if (s <= 0) {
                System.out.println("Выиграл первый игрок");
                break;
            }
            System.out.println("Осталость " + s);
            System.out.println("Ходит второй игрок");
            int second = Integer.valueOf(input.nextLine());
            s = s - second;
            System.out.println("Осталось " + s);
            if (s <= 0) {
                System.out.println("Выиграл второй игрок");
                break;
            }
        }
    }
}
