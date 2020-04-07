package ru.job4j.stream;

import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Student ivan = new Student(50, "Petrov");
        Predicate<Student> predict =  student ->
                student.getScore() >= 70 && student.getScore() <= 100;
        System.out.println(predict.test(ivan));
    }
}
