import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.MemTracker;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MemTrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        MemTracker tracker = new MemTracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenGetAllItem() {
        MemTracker tracker = new MemTracker();
        Item item = new Item("test1");
        Item item1 = new Item("test2");
        Item item2 = new Item("test3");
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        List<Item> expected = Arrays.asList(item, item1, item2);
        List<Item> result = tracker.findAll();
        assertThat(result, is(expected));
    }

    @Test
    public void whenFindByIdThenTrackerFindSameItem() {
        MemTracker tracker = new MemTracker();
        Item item = new Item("one");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result, is(item));
    }

    @Test
    public void whenFindByNameThenTrackerFindSameItem() {
        MemTracker tracker = new MemTracker();
        Item item = new Item("test2");
        tracker.add(item);
        List<Item> expected = Arrays.asList(item);
        List<Item> result = tracker.findByName(item.getName());
        assertThat(result, is(expected));
    }
    @Test
    public void whenReplace() {
        MemTracker tracker = new MemTracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        Integer id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        MemTracker tracker = new MemTracker();
        Item bug = new Item("Bug");
        Item bug1 = new Item("Bug1");
        Item bug2 = new Item("Bug3");
        Item bug3 = new Item("bug4");
        tracker.add(bug);
        tracker.add(bug1);
        tracker.add(bug2);
        tracker.add(bug3);
        Integer id = bug.getId();
        Integer id1 = bug1.getId();
        Integer id2 = bug2.getId();
        Integer id3 = bug3.getId();
        tracker.delete(id1);
        assertThat(tracker.findById(id1), is(nullValue()));
    }
}
