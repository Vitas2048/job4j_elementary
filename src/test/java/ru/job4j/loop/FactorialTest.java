package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int expected = 120;
        int rsl = Factorial.calc(n);
        Assert.assertEquals(expected, rsl);
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        int n = 0;
        int expected = 1;
        int rsl = Factorial.calc(n);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenCalculateFactorialForThreeThenSix() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        int n = 3;
        int expected = 6;
        int rsl = Factorial.calc(n);
        Assert.assertEquals(expected, rsl);
    }
}