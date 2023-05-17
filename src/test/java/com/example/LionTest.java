package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        lion = new Lion(feline);
    }
    @Mock
    Feline feline;
    Lion lion;

    @Test
    public void checkGetKittens() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals("Ошибка: полученное количество kittens не совпадает с ожидаемым результатом", 1, lion.getKittens());
    }
    @Test
    public void checkDoesHaveManeTrue() throws Exception {
        Lion maleLion = new Lion("Самец");
        assertTrue("Ошибка: полученное значение не равно true", maleLion.doesHaveMane());
    }
    @Test
    public void checkDoesHaveManeFalse() throws Exception {
        Lion femaleLion = new Lion("Самка");
        assertFalse("Ошибка: полученное значение не равно false", femaleLion.doesHaveMane());
    }
    @Test(expected = Exception.class)
    public void checkDoesHaveManeException() throws Exception {
        Lion exceptionLion = new Lion("Исключение");
    }
    @Test
    public void checkGetFood() throws Exception {
        Mockito.when(feline.getFood()).thenReturn(Arrays.asList("мясо", "рыба"));
        assertEquals("Ошибка: полученный список для lion не совпадает с ожидаемым результатом", Arrays.asList("мясо", "рыба"), lion.getFood());
    }
}