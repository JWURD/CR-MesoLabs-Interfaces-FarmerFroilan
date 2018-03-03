package com.zipcodewilmington.froilansfarm.farmstructures;


import com.zipcodewilmington.froilansfarm.farmanimal.Horse;

import java.util.ArrayList;

public class Stable {
    ArrayList<Horse> horses;

    public Stable() {
        this.horses = new ArrayList<Horse>();

    }
    public boolean add(Horse theHorse) {
        return false;
    }

    public boolean remove(Horse theHorse) {
        return false;
    }

    public ArrayList<Horse> getHorses() {
        return this.horses;
    }
}
