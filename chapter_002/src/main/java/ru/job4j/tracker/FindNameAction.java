package ru.job4j.tracker;

public class FindNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String key = input.askStr("Enter key: ");
        Item[] items = tracker.findByName(key);
        for (Item item : items) {
            System.out.println(item.getName() + ", " + item.getId());
        }
        return true;
    }

}


