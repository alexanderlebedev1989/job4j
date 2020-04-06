package ru.job4j.stream;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
   @Test
    public void whenListInMap() {
      School school = new School();
      Student st1 = new Student(90, "Petrov");
      Student st2 = new Student(50, "Ivanov");
      Student st3 = new Student(100, "Sidorov");
      Student st4 = new Student(90, "Petrov");
      List<Student> students = Arrays.asList(st1, st2, st3, st4);
      Map<String, Student> result = school.collect(students);
      Map<String, Student> expected = new HashMap<>();
      expected.put(st1.getName(), st1);
      expected.put(st2.getName(), st2);
      expected.put(st3.getName(), st3);
      assertThat(result, is(expected));
   }

    @Test
    public void whenListSortAndWhileAndNull() {
        School school = new School();
        int bound = 50;
        Student st1 = new Student(90, "Petrov");
        Student st2 = null;
        Student st3 = new Student(100, "Ivanov");
        Student st4 = null;
        Student st5 = new Student(50, "Sidorov");
        Student st6 = new Student(90, "Sokolov");
        List<Student> students = Arrays.asList(st1, st2, st3, st4, st5, st6);
        List<Student> result = school.levelOf(students, bound);
        List<Student> expected = Arrays.asList(st3, st1);
        assertThat(result, is(expected));
    }
}

