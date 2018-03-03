package com.zipcodewilmington.froilansfarm.farmstructures;

import com.zipcodewilmington.froilansfarm.farmanimal.Chicken;
import com.zipcodewilmington.froilansfarm.farmutilities.Edible;

import java.util.ArrayList;

public class ChickenCoop {
    ArrayList<Chicken> chickens;

    public ChickenCoop() {
        this.chickens = new ArrayList<Chicken>();

    }

    public boolean add(Chicken chickenlittle) {
        return false;
    }

    public boolean remove(Chicken chickenLittle) {
        return false;
    }

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }
}
