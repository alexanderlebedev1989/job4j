package ru.job4j.loop;

import org.junit.Test;
import ru.job4j.array.SwitchArray;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0To3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap0To2() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {3, 2, 1, 4};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 2);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1To1() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {1, 4, 3, 2};
        int[] rsl = SwitchArray.swap(input, 1, input.length - 1);
        assertThat(rsl, is(expect));
    }
}
