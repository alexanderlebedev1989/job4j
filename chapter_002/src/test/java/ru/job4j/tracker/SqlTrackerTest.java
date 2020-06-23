//package ru.job4j.tracker;
//
//import org.junit.Test;
//import java.util.List;
//import static org.hamcrest.core.Is.is;
//import static org.hamcrest.core.IsNull.nullValue;
//import static org.junit.Assert.assertThat;
//
//public class SqlTrackerTest {
//
//    @Test
//    public void createItem() throws Exception {
//        try (Store tracker = new SqlTracker(ConnectionRollback.create(SqlTracker.init()))) {
//            tracker.add(new Item("name"));
//            assertThat(tracker.findByName("name").size(), is(1));
//        }
//    }
//
//    @Test
//    public void editItem() throws Exception {
//        try (Store tracker = new SqlTracker(ConnectionRollback.create(SqlTracker.init()))) {
//            Item item = new Item("test1");
//            tracker.add(item);
//            tracker.replace(item.getId(), new Item("new"));
//            assertThat(tracker.findByName("new").size(), is(1));
//
//        }
//    }
//
//    @Test
//    public void deleteItem() throws Exception {
//        try (Store tracker = new SqlTracker(ConnectionRollback.create(SqlTracker.init()))) {
//            Item item = new Item("test1");
//            tracker.add(item);
//            tracker.delete(item.getId());
//            assertThat(tracker.findById(item.getId()), is(nullValue()));
//
//        }
//    }
//
//    @Test
//    public void findByName() throws Exception {
//        try (Store tracker = new SqlTracker(ConnectionRollback.create(SqlTracker.init()))) {
//            Item item = new Item("test1");
//            tracker.add(item);
//            List<Item> result = tracker.findByName(item.getName());
//            assertThat(result.size(), is(1));
//
//        }
//    }
//
//    @Test
//    public void findById() throws Exception {
//        try (Store tracker = new SqlTracker(ConnectionRollback.create(SqlTracker.init()))) {
//            Item item = new Item("test1");
//            tracker.add(item);
//            Item result = tracker.findById(item.getId());
//            assertThat(result.getName(), is("test1"));
//
//        }
//    }
//
//    @Test
//    public void showListItems() throws Exception {
//        try (Store tracker = new SqlTracker(ConnectionRollback.create(SqlTracker.init()))) {
//            tracker.add(new Item("test1"));
//            tracker.add(new Item("test2"));
//            List<Item> result = tracker.findAll();
//            assertThat(result.size(), is(2));
//
//        }
//    }
//}
