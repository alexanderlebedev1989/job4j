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
      expected.put(st1.getSurname(), st1);
      expected.put(st2.getSurname(), st2);
      expected.put(st3.getSurname(), st3);
      assertThat(result, is(expected));
   }
}

