package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenPrivetThenPrivetumnik() {
        String question = "Привет, Бот.";
        String rsl = DummyBot.answer(question);
        String expected = "Привет, умник";
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenPokaThenDoskoroyvstrechi() {
        String question = "Пока.";
        String rsl = DummyBot.answer(question);
        String expected = "До скорой встречи";
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenSmthElseThenAnotherqst() {
        String question = "фывфцввапыывпртол";
        String rsl = DummyBot.answer(question);
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assert.assertEquals(expected, rsl);
    }
}