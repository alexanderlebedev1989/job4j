package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MemTracker {
    private final List<Item> items = new ArrayList<>();

    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
        return item;
    }

    private int generateId() {
        Random rm = new Random();
        return rm.nextInt() + (int)System.currentTimeMillis();
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> listOfNames = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().contains(key)) {
                listOfNames.add(item);
            }
        }
        return listOfNames;
    }

    public Item findById(Integer id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public boolean replace(Integer id, Item item) {
        boolean found = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items.set(index, item);
            found = true;
        }
        return found;
    }

    private int indexOf(Integer id) {
        int result = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                result = index;
                break;
            }
        }
        return result;
    }

    public boolean delete(Integer id) {
        boolean found = false;
        int index = indexOf(id);
        if (index != -1) {
            items.remove(items.get(index));
            found = true;
        }
        return found;
    }
}



