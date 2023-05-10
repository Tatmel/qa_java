package com.example;

import java.util.List;

public class LionAlex extends Lion{
    boolean hasMane;
    Lion lion;
public LionAlex(String sex, Lion lion) throws Exception {
    super(sex);
    hasMane = true;
    this.lion = lion;
}
    @Override
    public int getKittens() {
        return 0;
    }
    public List<String> getFriends() {
        return List.of("Марти, Глория, Мелман");
    }
    public String getPlaceLiving() {
        return "Нью-Йоркский зоопарк";
    }
}