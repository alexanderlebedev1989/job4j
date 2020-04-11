package ru.job4j.lambda;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Group {
    public static Map<String, Set<String>> sections(List<Student> students) {
        return students.stream()
                .flatMap(student -> {
                    var holder = student.getUnits().stream().
                           map(s -> new Holder(s, student.getName())).collect(Collectors.toList());
                    return holder.stream();
                }).collect(
                        Collectors.groupingBy(Holder::getKey,
                                Collector.of(HashSet::new,
                                        (set, el) -> set.add(el.getValue()),
                                        (left, right) -> {
                                           left.addAll(right);
                                            return left;
                                        }
                                )
                        )
                );
    }
}