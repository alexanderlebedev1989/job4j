package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = new ArrayList<>(List.of("k1/sk1"));
        List<String> expect = new ArrayList<>(List.of("k1", "k1/sk1"));
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChange() {
        List<String> input = new ArrayList<>(List.of("k1", "k1/sk1"));
        List<String> expect = new ArrayList<>(List.of("k1", "k1/sk1"));
        List<String> result = Departments.fillGaps(input);
        Departments.sortAsc(result);
        assertThat(result, is(expect));
    }

    @Test
    public void whenDesc() {
        List<String> input = new ArrayList<>(List.of("k1", "k1/sk1", "k2"));
        List<String> expect = new ArrayList<>(List.of("k2", "k1", "k1/sk1"));
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesc(result);
        assertThat(result, is(expect));
    }
}