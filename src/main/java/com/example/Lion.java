package com.example;

import java.util.List;

public class Lion {

    private boolean hasMane;
    private ILion ilion;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }
    public Lion(Feline feline) {
        this.ilion = feline;
    }

    public int getKittens() {
        return ilion.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return ilion.getFood();
    }
}
