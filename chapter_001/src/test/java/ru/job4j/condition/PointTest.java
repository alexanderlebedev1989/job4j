package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        int in1 = 0;
        int in2 = 0;
        int in3 = 2;
        int in4 = 0;
        double expected = 2;
        double out = Point.distance(in1, in2, in3, in4);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance1() {
        int in1 = 1;
        int in2 = 2;
        int in3 = 0;
        int in4 = 3;
        double expected = 1.41;
        double out = Point.distance(in1, in2, in3, in4);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2() {
        int in1 = 0;
        int in2 = 3;
        int in3 = -1;
        int in4 = -5;
        double expected = 8.06;
        double out = Point.distance(in1, in2, in3, in4);
        Assert.assertEquals(expected, out, 0.01);
    }
}
