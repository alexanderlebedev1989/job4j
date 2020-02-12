package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = find.indexOf(data, el);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas11Then0() {
        FindLoop find = new FindLoop();
        int[] data = new int[] {5, 10, 3};
        int el = 7;
        int result = find.indexOf(data, el);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
