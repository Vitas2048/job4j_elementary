package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void WhenBound5() {
        int[] expect = new int[] {0, 1, 4, 9, 16};
        int[] rsl = Square.calculate(5);
        Assert.assertArrayEquals(expect, rsl);
    }
}