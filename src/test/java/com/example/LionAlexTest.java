package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    @Before
    public void init() throws Exception {
        MockitoAnnotations.initMocks(this);
        lion = new Lion("Самец");
        lionAlex = new LionAlex("Самец", lion);
    }
    @Mock
    Lion lion;
    LionAlex lionAlex;

    @Test
    public void checkGetKittens() {
        int actual = lionAlex.getKittens();
        assertEquals("Ошибка: у льва Алекса нет детей", 0, actual);
    }

    @Test
    public void checkGetFriends() {
        List<String> actual = lionAlex.getFriends();
        assertEquals("Это не список друзей Алекса", List.of("Марти, Глория, Мелман"), actual);
    }

    @Test
    public void checkGetPlaceLiving() {
        String actual = lionAlex.getPlaceLiving();
        assertEquals("Ошибка: место жительства не равно Нью-Йорский зоопарк", "Нью-Йоркский зоопарк", actual);
    }
}