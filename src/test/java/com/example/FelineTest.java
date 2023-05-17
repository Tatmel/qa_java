package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    @Test
    public void checkEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }
    @Test
    public void checkGetFood() throws Exception {
        Feline feline = new Feline();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.getFood());
    }
    @Test
    public void checkGetFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void checkGetKittensWithDefault() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }
    @Test
    public void checkGetKittensWithCount() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }
}
