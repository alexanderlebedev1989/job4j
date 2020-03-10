package ru.job4j.tracker;

public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String key = input.askStr("Enter key: ");
        for (Item item : tracker.findByName(key)) {
            System.out.println(String.format("%s", item.getName() + ", " + item.getId()));
        }
        return true;
    }

}


