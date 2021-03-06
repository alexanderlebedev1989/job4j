package ru.job4j.tracker;

public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        String key = input.askStr("Enter key: ");
        if (tracker.findByName(key).isEmpty()) {
            System.out.println("Данные не найдены. Попробуйте снова");
        } else {
            for (Item item : tracker.findByName(key)) {
                System.out.println(String.format("%s", item.getName() + ", " + item.getId()));
            }
        }
        return true;
    }
}


