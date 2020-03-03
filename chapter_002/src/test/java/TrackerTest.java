import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenGetAllItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        Item item1 = new Item("test2");
        Item item2 = new Item("test3");
        tracker.add(item);
        tracker.add(item1);
        tracker.add(item2);
        Item[] expected = {item, item1, item2};
        Item[] result = tracker.findAll();
        assertThat(result, is(expected));
    }

    @Test
    public void whenFindByIdThenTrackerFindSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("one");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result, is(item));
    }

    @Test
    public void whenFindByNameThenTrackerFindSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test2");
        tracker.add(item);
        Item[] expected = {item};
        Item[] result = tracker.findByName(item.getName());
        assertThat(result, is(expected));
    }
    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        Item bug1 = new Item("Bug1");
        Item bug2 = new Item("Bug3");
        Item bug3 = new Item("bug4");
        tracker.add(bug);
        tracker.add(bug1);
        tracker.add(bug2);
        tracker.add(bug3);
        String id = bug.getId();
        String id1 = bug1.getId();
        String id2 = bug2.getId();
        String id3 = bug3.getId();
        tracker.delete(id1);
        assertThat(tracker.findById(id1), is(nullValue()));
    }
}
