package udemy;

import com.sun.jdi.IntegerType;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaTestTwo {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        List<Integer> list1 = new ArrayList<>();
        fillArr(array1);
        fillList(list1);

        // map method
        array1 = Arrays.stream(array1).map(a -> a * 2).toArray();
        list1 = list1.stream().map(a -> a * 2).collect(Collectors.toList());

        array1 = Arrays.stream(array1).map(a -> 3).toArray();
        list1 = list1.stream().map(a -> 4).collect(Collectors.toList());

        System.out.println(Arrays.toString(array1));
        System.out.println(list1);

        // filter method
        int[] array2 = new int[10];
        List<Integer> list2 = new ArrayList<>();
        fillArr(array2);
        fillList(list2);

        array2 = Arrays.stream(array2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());

        System.out.println(Arrays.toString(array2));
        System.out.println(list2);

        // fourEach method
        Arrays.stream(array2).forEach(System.out::println); // сокращение
        list2.stream().forEach(a -> System.out.println(a));

        // reduce method
        int[] array3 = new int[10];
        List<Integer> list3 = new ArrayList<>();
        fillArr(array3);
        fillList(list3);

        int sum1 = Arrays.stream(array3).reduce((acc, b) -> acc + b).getAsInt();
        int sum2 = list3.stream().reduce((acc, b) -> acc * b).get();

        System.out.println(sum1);
        System.out.println(sum2);

        // combo methods
        int[] array4 = new int[10];
        fillArr(array4);

        int[] newArray = Arrays.stream(array4).filter(a -> a % 2 != 0).map(a -> a * 2).toArray();
        System.out.println(Arrays.toString(newArray));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        System.out.println(set);
        set = set.stream().map(a -> a * 3).collect(Collectors.toSet());
        System.out.println(set);
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }

    private static void fillArr(int[] array) {
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
    }
}
