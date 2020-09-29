package ru.job4j.di;

import org.springframework.stereotype.Component;

@Component
public class StartUI {
    private ConsoleInput input;

    public StartUI(ConsoleInput input) {
        this.input = input;
    }

    public void add(String value) {
        input.add(value);
    }

    public void print() {
        for (String value : input.getAll()) {
            System.out.println(value);
        }
    }
}
