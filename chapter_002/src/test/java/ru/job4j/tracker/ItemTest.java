package ru.job4j.tracker;

import org.junit.Test;
import java.util.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemTest {
    @Test
    public void ascending() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Bob"));
        items.add(new Item("Anna"));
        items.add(new Item("Son"));
        Collections.sort(items, new ItemAscending());
        assertThat(items, is(Arrays.asList(
                    new Item("Anna"),
                    new Item("Bob"),
                    new Item("Son")
        )));
    }

    @Test
    public void descending() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Bob"));
        items.add(new Item("Anna"));
        items.add(new Item("Son"));
        Collections.sort(items, new ItemDescending());
        assertThat(items, is(Arrays.asList(
                new Item("Son"),
                new Item("Bob"),
                new Item("Anna")
        )));
    }
}
