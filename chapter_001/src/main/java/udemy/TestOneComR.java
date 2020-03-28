package udemy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestOneComR {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("кошка");
        animals.add("ворона");
        animals.add("лев");
        animals.add("лиса");

        Collections.sort(animals, new StringLengthComparator());
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(1);
        numbers.add(19);
        numbers.add(7);
        numbers.add(127);

        Collections.sort(numbers, new BackwardsIntegerComparator());
        System.out.println(numbers);

        List<Person> people = new ArrayList<>();

        people.add(new Person(8, "Сергей"));
        people.add(new Person(3, "Никита"));
        people.add(new Person(1, "Саня"));
        people.add(new Person(19, "Виктор"));

        Collections.sort(people, new Person(1, "Виктор"));
        System.out.println(people);

        // для классов String, Integer идет порядок по умолчанию(лексико-графический)
        // для других классов его нужно задавать

    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /*
        o1 > o2 = 1
        o1 < o2 = -1
        o1 == o2 = 0
         */
        if (o1.length() > o2.length()) {
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class BackwardsIntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2) {
            return -1;
        } else if (o1 < o2) {
            return 1;
        } else {
            return 0;
        }
    }
}
class Person implements Comparator<Person> {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" + "id="
                + id + ", name='"
                + name + '\'' + '}';
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

