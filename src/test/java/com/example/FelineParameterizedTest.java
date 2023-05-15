package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final int kittensCount;
    private final int expected;

    public FelineParameterizedTest(int kittensCount, int expected) {
        this.kittensCount = kittensCount;
        this.expected = expected;
    }
    @Parameterized.Parameters(name = "Количество kittens. Тестовые данные: {0} {1}")
    public static Object[][] getKittens() {
        return new Object[][] {
                {1, 1},
                {10, 10},
                {0, 0},
                {Integer.MAX_VALUE, Integer.MAX_VALUE}
        };
    }
    @Test
    public void checkGetKittens() {
        Feline feline = new Feline();
        int count = feline.getKittens(kittensCount);
        assertEquals(expected, count);
    }
}
