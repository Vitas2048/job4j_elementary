package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenLeft7Right8Then8() {
        int left = 7;
        int right = 8;
        int expected = 8;
        int rsl = Max.max(left, right);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenLeft7Right7Then7() {
        int left = 7;
        int right = 7;
        int expected = 7;
        int rsl = Max.max(left, right);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenLeft11Right7Then11() {
        int left = 11;
        int right = 7;
        int expected = 11;
        int rsl = Max.max(left, right);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenfirst1second2third3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int expected = 3;
        int rsl = Max.max(first, second, third);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenfirst3second2third10fourth4Then10() {
        int first = 3;
        int second = 2;
        int third = 10;
        int fourth = 4;
        int expected = 10;
        int rsl = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, rsl);
    }
}