package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {
    Map<String, Student> collect(List<Student> students) {
        return students.stream().collect(Collectors.toMap(Student::getName, student -> student,
                ((student, student2) -> student)
                ));
    }
    List<Student> levelOf(List<Student> students, int bound) {
        return students.stream().flatMap(Stream::ofNullable).
                takeWhile(student -> student.getScore() > bound).
                sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
    }
}
