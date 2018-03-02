package com.zipcodewilmington.froilansfarm.farmanimal.Person;

import com.zipcodewilmington.froilansfarm.farmanimal.Edible;
import com.zipcodewilmington.froilansfarm.field.Crop;

public class Farmer extends Person implements Rider, Botanist{

    public boolean plant(Crop theCrop) {
        return false;
    }

    public void eat(Edible theEddible) {

    }

    public boolean mount() {
        return false;
    }

    public boolean dismount() {
        return false;
    }

    public String makeNoise() {
        return null;
    }
}
