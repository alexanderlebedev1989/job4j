package ru.job4j.condition;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax2To1Then() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2Then() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To1Then() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenMax3Numbers() {
        double in1 = 1.0;
        double in2 = 2.0;
        double in3 = 3.5;
        double expected = 6.5;
        double result = Max.add(in1, in2, in3);
        assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenMax4Numbers() {
        double in1 = 1.0;
        double in2 = 2.0;
        double in3 = 3.5;
        double in4 = 4;
        double expected = 10.5;
        double result = Max.add(in1, in2, in3, in4);
        assertEquals(expected, result, 0.01);
    }


}
