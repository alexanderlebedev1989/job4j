package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }

    @Test
    public void whenArea() {
        Point in1 = new Point(0, 1);
        Point in2 = new Point(2, 1);
        Point in3 = new Point(2, 2);
        Triangle in4 = new Triangle(in1, in2, in3);
        double expected = 1;
        double out = in4.area();
        assertThat(expected, is(out));
    }
}

