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
            if (items[i].getName().equals(key)) {
                listOfNames[size++] = items[i];
            }
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
            if (items[i] == items[indexOf(id)]) {
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

    public boolean delete(String id) {
        boolean found = false;
        for (int i = 0; i < position; i++) {
            if (items[i] == items[indexOf(id)]) {
                System.arraycopy(items, i + 1, items, i, position - i);
                items[position - 1] = null;
                position--;
                found = true;
                break;
            }
        }
        return found;
    }
}


