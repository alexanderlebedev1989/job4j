package ru.job4j.collection;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenAscByName() {
        List<Job> result = new ArrayList<>(List.of(
                new Job("сон", 1),
                new Job("обучение", 3)

        ));
        List<Job> expected = new ArrayList<>(List.of(
                new Job("обучение", 3),
                new Job("сон", 1)
        ));
        result.sort(new JobAscByName());
        assertThat(result, is(expected));
    }

    @Test
    public void whenDescByName() {
        List<Job> result = new ArrayList<>(List.of(
                new Job("кино", 1),
                new Job("стирка", 3)
        ));
        List<Job> expected = new ArrayList<>(List.of(
                new Job("стирка", 3),
                new Job("кино", 1)
        ));
        result.sort(new JobDescByName());
        assertThat(result, is(expected));
    }

    @Test
    public void whenAscByPriority() {
        List<Job> result = new ArrayList<>(List.of(
                new Job("работа", 3),
                new Job("отдых", 1)
        ));
        List<Job> expected = new ArrayList<>(List.of(
                new Job("отдых", 1),
                new Job("работа", 3)
        ));
        result.sort(new JobAscByPriority());
        assertThat(result, is(expected));
    }

    @Test
    public void whenDescByPriority() {
        List<Job> result = new ArrayList<>(List.of(
                new Job("охота", 1),
                new Job("рыбалка", 2)
        ));
        List<Job> expected = new ArrayList<>(List.of(
                new Job("рыбалка", 2),
                new Job("охота", 1)
        ));
        result.sort(new JobDescByPriority());
        assertThat(result, is(expected));
    }

    @Test
    public void whenComparatorByNameAndPriorityDesc() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenComparatorByNameAndPriorityAsc() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}
