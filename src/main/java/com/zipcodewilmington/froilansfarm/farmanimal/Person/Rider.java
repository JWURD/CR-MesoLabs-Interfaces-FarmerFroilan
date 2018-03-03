package com.zipcodewilmington.froilansfarm.farmanimal.Person;

import com.zipcodewilmington.froilansfarm.farmutilities.Rideable;

public interface Rider {

    /*checks to see if ridable is allready mounted
    if not we set ridebable object to true and return rideable object.*/
    public Rideable mount(Rideable object);

    public void dismount(Rideable object);

}
