package org.example.builder.burger;

import org.example.builder.Item;
import org.example.builder.packing.Packing;
import org.example.builder.packing.Wrapper;

public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
