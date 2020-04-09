package ru.job4j.lambda;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GroupTest {
    @Test
    public void whenAddSomeStudentsThenGroupThem() {
        List<Student> students = List.of(
                new Student("Иван", Set.of("бокс", "плавание", "рисование")),
                new Student("Сергей", Set.of("бокс", "стрельба")),
                new Student("Виталик", Set.of("рисование", "плавание"))
                );
        Map<String, Set<String>> expected = Map.of(
                "бокс", Set.of("Иван", "Сергей"),
                "плавание", Set.of("Виталик", "Иван"),
                "стрельба", Set.of("Сергей"),
                "рисование", Set.of("Виталик", "Иван")
        );
        var result = Group.sections(students);
        assertThat(result, is(expected));

    }

}
