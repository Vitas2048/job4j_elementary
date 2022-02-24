package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenX1Eq1Y1Eq1X2Eq1Y2Eq1Then0() {
        int x1 = 1;
        int x2 = 1;
        int y1 = 1;
        int y2 = 1;
        double expected = 0;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenX1Eq0Y1Eq0X2Eq2Y2Eq2Then2dot828427() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 2;
        double expected = 2.828;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenX1Eq0Y1Eq0X2Eq2Y2Eq4Then4dot472() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 4;
        double expected = 4.472;
        double rsl = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, rsl, 0.01);
    }

}