package ru.job4j.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        Collections.sort(jobs, new JobAscByName().thenComparing(new JobAscByPriority()));
        System.out.println(jobs);
    }
}
