package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactTest {
    @Test
    public void whenValueIsGreaterOne() {
        int rsl = Fact.calc(2);
        assertThat(rsl, is(1));
    }
    @Test(expected = IllegalArgumentException.class)
    public void whenValueIsLessOne() {
        Fact.calc(0);
    }
}

