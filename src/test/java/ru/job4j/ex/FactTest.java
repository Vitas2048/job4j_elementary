package ru.job4j.ex;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNLess0ThenFinish() {
        Fact F = new Fact();
        F.calc(-5);
    }

    @Test
    public void whenNMore0ThenFinish() {
        Fact  f = new Fact();
        int rsl = f.calc(5);
        assertThat(rsl, is(120));
    }
}