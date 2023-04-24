package org.example.factory;

import org.example.product.Color;
import org.example.product.Shape;

public abstract class AbstractFactory {


    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
