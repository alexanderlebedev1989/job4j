package ru.job4j.tracker;

public class ShowItemAction implements UserAction {

    @Override
    public String name() {
        return "=== List of all applications ===";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(String.format("%s", item.getName() + ", " + item.getId()));
        }
        return true;
    }
}
