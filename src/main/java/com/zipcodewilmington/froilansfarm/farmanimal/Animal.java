package com.zipcodewilmington.froilansfarm.farmanimal;

import com.zipcodewilmington.froilansfarm.farmutilities.Edible;
import com.zipcodewilmington.froilansfarm.farmutilities.NoiseMaker;

public abstract class Animal<E> implements Eater, Edible, NoiseMaker {
    protected int id;
    protected String name;

    public Animal(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return null;
    }

    public int getId() {
        return 0;
    }

    public void eat(Edible theEddible, int amount) {

    }

    public abstract String makeNoise();

    public boolean isEdible(Edible theEdible) {
        return false;
    }

    public Edible getEdibleFood() {
        return null;
    }
}
