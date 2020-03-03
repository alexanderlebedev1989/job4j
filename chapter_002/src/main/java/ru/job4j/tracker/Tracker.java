package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    private final Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    public Item[] findByName(String key) {
        Item[] listOfNames = new Item[position];
        int size = 0;
        for (int i = 0; i < position; i++) {
            if (this.items[i] != null && (this.items[i].getName().equals(key))) {
                listOfNames[size] = items[i];
            }
            size++;
        }

        return Arrays.copyOf(listOfNames, size);
    }

    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(String id, Item item) {
        boolean found = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == findById(id)) {
                item.setId(id);
                items[i] = item;
                found = true;
                break;
            }
        }
        return found;
    }

    private int indexOf(String id) {
        int result = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                result = index;
                break;
            }
        }
        return result;
    }
}


