package com.zipcodewilmington.froilansfarm.farmanimal;

import com.zipcodewilmington.froilansfarm.farmutilities.Edible;
import com.zipcodewilmington.froilansfarm.farmutilities.Produce;

public class Chicken extends Animal implements Produce {


    public Chicken(int id, String name) {
        super(id, name);
    }

    public void eat(Edible theEddible) {

    }

    public String makeNoise() {
        return null;
    }

    public Edible yeild() {
        return null;
    }
}
