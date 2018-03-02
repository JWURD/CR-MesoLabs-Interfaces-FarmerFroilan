package com.zipcodewilmington.froilansfarm.farmvehicles;

public class AirCraft extends Vehicle {
    boolean isFlying;

    public AirCraft() {
        isFlying = false;
    }

    public void setIsFlying(boolean flying) {
        this.isFlying = flying;
    }

    public boolean fly() {
        return isFlying;
    }

    public String makeNoise() {
        return null;
    }

    public boolean isMounted() {
        return false;
    }
}
