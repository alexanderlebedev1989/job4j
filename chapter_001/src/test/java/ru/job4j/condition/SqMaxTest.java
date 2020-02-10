package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenMaxFirst() {
        SqMax check = new SqMax();
        int result = check.max(7, 4 , 6 ,5);
        assertThat(result, is(7));
    }
    @Test
    public void whenMaxSecond() {
        SqMax check = new SqMax();
        int result = check.max(4, 7 , 6 ,5);
        assertThat(result, is(7));
    }

    @Test
    public void whenMaxThird() {
        SqMax check = new SqMax();
        int result = check.max(4, 6 , 7 ,5);
        assertThat(result, is(7));
    }

    @Test
    public void whenMaxForth() {
        SqMax check = new SqMax();
        int result = check.max(4, 6 , 5 ,7);
        assertThat(result, is(7));
    }

}
