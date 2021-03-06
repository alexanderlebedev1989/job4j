package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax2To1Then() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2Then() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To1Then() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenMax4() {
        int result = Max.max(1, 2, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax7() {
        int result = Max.max(1, 2, 4, 7);
        assertThat(result, is(7));
    }
}
