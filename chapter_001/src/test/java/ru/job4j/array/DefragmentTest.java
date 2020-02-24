package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class DefragmentTest {
    @Test
    public void notFirstNull1() {
        String[] array = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(array);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }

    @Test
    public void firstNull1() {
        String[] array = {null, "I", "wanna", null, "be", null, "compressed"};
        String[] compressed = Defragment.compress(array);
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        assertThat(compressed, is(expected));
    }
}
