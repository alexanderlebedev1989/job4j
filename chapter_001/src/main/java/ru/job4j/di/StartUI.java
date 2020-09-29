package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StartUI {

    @Autowired
    private ConsoleInput input;

    public void add(String value) {
        input.add(value);
    }

    public void print() {
        for (String value : input.getAll()) {
            System.out.println(value);
        }
    }
}
