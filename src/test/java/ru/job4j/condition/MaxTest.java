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
}