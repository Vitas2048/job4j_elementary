package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2;
        double ac = 2;
        double bc = 2;
        boolean rsl = Triangle.exist(ab, bc, bc);
        Assert.assertTrue(rsl);
    }

    @Test
    public void whenNotExist() {
        double ab = 5;
        double ac = 2;
        double bc = 2;
        boolean rsl = Triangle.exist(ab, bc, bc);
        Assert.assertFalse(rsl);
    }
}