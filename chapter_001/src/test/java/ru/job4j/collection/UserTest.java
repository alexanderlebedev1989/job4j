package ru.job4j.collection;

import org.junit.Test;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> result = new TreeSet<>(Set.of(
                new User("Petr", 32),
                new User("Lola", 28),
                new User("Ivan", 31))
        );
        Set<User> expected = new TreeSet<>(Set.of(
                new User("Ivan", 31),
                new User("Lola", 28),
                new User("Petr", 32)
        ));
        assertThat(result, is(expected));
    }

    @Test
    public void whenComparePetrVSUvan() {
        int rsl = new User("Petr", 32)
                .compareTo(
                        new User("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }
}