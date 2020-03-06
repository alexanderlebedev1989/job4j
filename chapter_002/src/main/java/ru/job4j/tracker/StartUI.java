package ru.job4j.tracker;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println(item.getName() + ", " + item.getId());
            } else if (select == 1) {
                System.out.println("=== List of all applications ===");
                Item[] items = tracker.findAll();
                for (Item item : items) {
                    System.out.println(item.getName() + ", " + item.getId());
                }
            } else if (select == 2) {
                System.out.println("=== Edit Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item newItem = new Item(name);
                tracker.add(newItem);
                System.out.println("Enter id: ");
                String id = scanner.nextLine();
                if (tracker.replace(id, newItem)) {
                    System.out.println("Операция выполнена успешно");
                } else {
                    System.out.println("Возникла ошибка. Попробуйте снова.");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Операция выполнена успешно");
                } else {
                    System.out.println("Возникла ошибка. Попробуйте снова.");
                }
                System.out.println();
            } else if (select == 4) {
                System.out.println("=== Find item by Id ===");
                System.out.print("Enter id: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                System.out.println(item.getName() + ", " + item.getId());
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.print("Enter key: ");
                String key = scanner.nextLine();
                Item[] items1 = tracker.findByName(key);
                for (Item item : items1) {
                    System.out.println(item.getName() + ", " + item.getId());
                }
            } else if (select == 6) {
                System.out.println("=== Exit Program ===");
                run = false;
            }
            System.out.println();
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by Id.");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit Program.");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
