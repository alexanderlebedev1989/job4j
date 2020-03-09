package ru.job4j.tracker;

public class ShowItemAction implements UserAction {

    @Override
    public String name() {
        return "=== List of all applications ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (Item item : items) {
            System.out.println(item.getName() + ", " + item.getId());
        }
        return true;
    }
}
