package ru.job4j.tracker;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;


public class HbmTrackerTest {
    @Test
    public void whenCreate() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item("test");
        tracker.add(item);
        List<Item> all = tracker.findAll();
        assertEquals(item, all.get(0));
    }

    @Test
    public void whenReplace() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item("test");
        tracker.add(item);
        Item item1 = new Item("test2");
        tracker.replace(item.getId(), item1);
        List<Item> all = tracker.findAll();
        assertEquals(item1.getName(), all.get(0).getName());
    }

    @Test
    public void whenDelete() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item();
        Item item1 = new Item();
        tracker.add(item);
        tracker.add(item1);
        tracker.delete(item.getId());
        List<Item> all = tracker.findAll();
        assertEquals(1, all.size());
    }

    @Test
    public void whenFindAll() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item();
        Item item1 = new Item();
        tracker.add(item);
        tracker.add(item1);
        List<Item> all = tracker.findAll();
        assertEquals(Arrays.asList(item, item1), all);
    }

    @Test
    public void whenFindByName() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item("test");
        tracker.add(item);
        List<Item> all = tracker.findByName(item.getName());
        assertEquals(item.getName(), all.get(0).getName());
    }

    @Test
    public void whenFindById() {
        HbmTracker tracker = new HbmTracker();
        Item item = new Item("test");
        tracker.add(item);
        Item expected = tracker.findById(item.getId());
        assertEquals(item, expected);
    }
}
