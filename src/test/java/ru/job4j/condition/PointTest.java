package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenX1Eq1Y1Eq1X2Eq1Y2Eq1Then0() {
        Point a = new Point(1, 1);
        Point b = new Point (1, 1);
        double expected = 0;
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenX1Eq0Y1Eq0X2Eq2Y2Eq2Then2dot828427() {
        Point a = new Point(0, 0);
        Point b = new Point (2, 2);
        double expected = 2.828;
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenX1Eq0Y1Eq0X2Eq2Y2Eq4Then4dot472() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 4;
        Point a = new Point(0, 0);
        Point b = new Point (2, 4);
        double expected = 4.472;
        double rsl = a.distance(b);
        Assert.assertEquals(expected, rsl, 0.01);
    }

}