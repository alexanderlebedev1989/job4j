package ru.job4j.stream;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void when10AClass() {
        School school = new School();
        List<Student> students = Arrays.asList(
                new Student(80),
                new Student(90),
                new Student(50)
        );
        List<Student> result = school.collect(students, student ->
                student.getScore() >= 70 && student.getScore() <= 100);
        List<Student> expected = Arrays.asList(
                new Student(80),
                new Student(90)
        );
        assertThat(result, is(expected));
    }

    @Test
    public void when10BClass() {
        School school = new School();
        List<Student> students = Arrays.asList(
                new Student(80),
                new Student(90),
                new Student(50)
        );
        List<Student> result = school.collect(students, student ->
                student.getScore() >= 50 && student.getScore() < 70);
        List<Student> expected = Arrays.asList(
                new Student(50)
        );
        assertThat(result, is(expected));
    }

    @Test
    public void when10CClass() {
        School school = new School();
        List<Student> students = Arrays.asList(
                new Student(80),
                new Student(70),
                new Student(40)
        );
        List<Student> result = school.collect(students, student ->
                student.getScore() >= 0 && student.getScore() < 50);
        List<Student> expected = Arrays.asList(
                new Student(40)
        );
        assertThat(result, is(expected));
    }
}

