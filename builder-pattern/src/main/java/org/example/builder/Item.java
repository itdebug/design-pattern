package org.example.builder;

import org.example.builder.packing.Packing;

public interface Item {

    public String name();

    public Packing packing();

    public float price();

}
