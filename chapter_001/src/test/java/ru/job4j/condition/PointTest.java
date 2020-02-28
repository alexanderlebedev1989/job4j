package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        Point in1 = new Point(0, 0);
        Point in2 = new Point(0, 2);
        double expected = 2;
        double out = in1.distance(in2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance1() {
        Point in1 = new Point(1, 2);
        Point in2 = new Point(0, 3);
        double expected = 1.41;
        double out = in1.distance(in2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance2() {
        Point in1 = new Point(0, 3);
        Point in2 = new Point(-1, -5);
        double expected = 8.06;
        double out = in1.distance(in2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance3() {
        Point in1 = new Point(0, 0, 1);
        Point in2 = new Point(0, 2, 1);
        double expected = 2;
        double out = in1.distance3d(in2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void distance4() {
        Point in1 = new Point(3, 0, 2);
        Point in2 = new Point(0, -1, -4);
        double expected = 6.78;
        double out = in1.distance3d(in2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
