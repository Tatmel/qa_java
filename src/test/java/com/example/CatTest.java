package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        cat = new Cat(feline);
    }

    @Mock
    Feline feline;
    Cat cat;

    @Test
    public void checkGetSound() {
        String actual = cat.getSound();
        assertEquals("Ошибка: кошка НЕ говорит 'Мяу'!", "Мяу", actual);
    }
    @Test
    public void checkGetFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Хищник"));
        assertEquals("Ошибка: полученный список НЕ совпадает с ожидаемым результатом", Arrays.asList("Хищник"), cat.getFood());
    }
}