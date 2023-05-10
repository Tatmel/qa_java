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
public class FelineMockTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        feline = new Feline();
    }
    @Mock
    Feline feline;
    @Test
    public void checkEatMeat() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("мясо", "рыба"));
        assertEquals(Arrays.asList("мясо", "рыба"), feline.eatMeat());
    }
    @Test
    public void checkGetFood() throws Exception {
        Mockito.when(feline.getFood()).thenReturn(Arrays.asList("мясо", "рыба"));
        assertEquals(Arrays.asList("мясо", "рыба"), feline.getFood());
    }

    @Test
    public void checkGetFamily() {
        //настроить мок для возврата строки "Кошачьи"
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        //вызвать метод getFamily() для фиктивного объекта Feline
        String actual = feline.getFamily();
        //проверяем, соответствует ли результат ожидаемой строке
        assertEquals("Ошибка: полученное семейство НЕ является кошачьим", "Кошачьи", actual);
    }

    @Test
    public void checkGetKittensWithParameter() {
        // настроить макет так, чтобы он возвращал целое число 3
        Mockito.when(feline.getKittens(3)).thenReturn(3);

        // вызвать метод getKittens() для фиктивного объекта Feline
        int actual = feline.getKittens(3);

        // проверяем, соответствует ли результат ожидаемому целому числу
        assertEquals("Ошибка: полученное значение kittens не совпадает с ожидаемым результатом", 3, actual);
    }
    @Test
    public void checkGetKittens() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, feline.getKittens());
    }
}
