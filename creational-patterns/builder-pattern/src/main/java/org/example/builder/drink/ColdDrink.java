package org.example.builder.drink;

import org.example.builder.Item;
import org.example.builder.packing.Bottle;
import org.example.builder.packing.Packing;

public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
