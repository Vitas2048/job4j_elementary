package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP4K1Then1() {
        double p = 4;
        double k = 1;
        double rsl = SqArea.square(p, k);
        double expected = 1;
        Assert.assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenP1K1Then0dot0625() {
        double p = 1;
        double k = 1;
        double rsl = SqArea.square(p, k);
        double expected = 0.0625;
        Assert.assertEquals(expected, rsl, 0.01);
    }
}