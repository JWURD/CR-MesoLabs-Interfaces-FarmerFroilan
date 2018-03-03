package com.zipcodewilmington.froilansfarm.farmvehicles;

import com.zipcodewilmington.froilansfarm.farmutilities.NoiseMaker;
import com.zipcodewilmington.froilansfarm.farmutilities.Rideable;

public abstract class Vehicle<E> implements NoiseMaker, Rideable {
    private String vehicleType;

    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getType() {
        return this.vehicleType;
    }

    public abstract String makeNoise();

    public boolean isMounted() {
        return false;
    }

}
