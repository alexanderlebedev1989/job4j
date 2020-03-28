package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenAscByName() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("сон", 1));
        jobs.add(new Job("обучение", 3));
        Collections.sort(jobs, new JobAscByName());
        assertThat(jobs, is(Arrays.asList(
                new Job("обучение", 3),
                new Job("сон", 1)
        )));
    }

    @Test
    public void whenDescByName() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("кино", 1));
        jobs.add(new Job("стирка", 3));
        Collections.sort(jobs, new JobDescByName());
        assertThat(jobs, is(Arrays.asList(
                new Job("стирка", 3),
                new Job("кино", 1)
        )));
    }
    @Test
    public void whenAscByPriority() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("работа", 3));
        jobs.add(new Job("отдых", 1));
        Collections.sort(jobs, new JobAscByPriority());
        assertThat(jobs, is(Arrays.asList(
                new Job("отдых", 1),
                new Job("работа", 3)
        )));
    }

    @Test
    public void whenDescByPriority() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job("охота", 1));
        jobs.add(new Job("рыбалка", 2));
        Collections.sort(jobs, new JobDescByPriority());
        assertThat(jobs, is(Arrays.asList(
                new Job("рыбалка", 2),
                new Job("охота", 1)
        )));
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
