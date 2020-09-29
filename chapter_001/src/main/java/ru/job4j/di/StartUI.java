package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
