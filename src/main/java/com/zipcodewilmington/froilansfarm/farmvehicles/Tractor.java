package com.zipcodewilmington.froilansfarm.farmvehicles;

public class Tractor extends Vehicle  implements FarmVehicle{
    public String makeNoise() {
        return null;
    }

    public boolean isMounted() {
        return false;
    }

    public boolean operate() {
        return false;
    }
}
