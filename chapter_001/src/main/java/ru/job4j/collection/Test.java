package ru.job4j.collection;

import java.util.List;
import java.util.Set;


public class Test {
    public static void main(String[] args) {
      Set.of(new User("Lola", 25), new User("Lola", 24)).stream().
                sorted(User::compareTo).
                forEach((user -> System.out.println(String.format("%s %s", user.getName(), user.getAge()))));


    }
}
