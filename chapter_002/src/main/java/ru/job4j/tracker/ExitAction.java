package ru.job4j.tracker;

public class ExitAction implements UserAction {
    @Override
    public String name() {
        return "=== Exit from the program ===";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        return false;
    }
}
