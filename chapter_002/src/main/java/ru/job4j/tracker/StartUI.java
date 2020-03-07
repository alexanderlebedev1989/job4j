package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.allItem(input, tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
                System.out.println();
            } else if (select == 4) {
                StartUI.findByIdItem(input, tracker);
            } else if (select == 5) {
                StartUI.findByName(input, tracker);
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println(item.getName() + ", " + item.getId());
    }

    public static void allItem(Input input, Tracker tracker) {
        System.out.println("=== List of all applications ===");
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item.getName() + ", " + item.getId());
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit Item ===");
        String name = input.askStr("Enter name: ");
        Item newItem = new Item(name);
        String id = input.askStr("Enter id: ");
        if (tracker.replace(id, newItem)) {
            System.out.println("Операция выполнена успешно");
        } else {
            System.out.println("Возникла ошибка. Попробуйте снова.");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        String id = input.askStr("Enter id: ");
        if (tracker.delete(id)) {
            System.out.println("Операция выполнена успешно");
        } else {
            System.out.println("Возникла ошибка. Попробуйте снова.");
        }
    }
    public static void findByIdItem(Input input, Tracker tracker) {
        System.out.println("=== Find item by Id ===");
        String id = input.askStr("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.getName() + ", " + item.getId());
        } else {
            System.out.println("Заявка не найдена");
        }
    }
    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String key = input.askStr("Enter key: ");
        Item[] items = tracker.findByName(key);
        for (Item item : items) {
            System.out.println(item.getName() + ", " + item.getId());
        }
    }
}
