package ru.job4j.stream;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void whenArrayToList() {
        Matrix matrix = new Matrix();
        Integer[][] order = {{7, 3, 1}, {2, 17, 9}};
        List<Integer> result = matrix.collect(order);
        List<Integer> excepted = Arrays.asList(7, 3, 1, 2, 17, 9);
        assertThat(result, is(excepted));
    }
}

