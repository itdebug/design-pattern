package org.example.factory.impl;

import org.example.factory.AbstractFactory;
import org.example.product.Color;
import org.example.product.Shape;
import org.example.product.impl.Blue;
import org.example.product.impl.Green;
import org.example.product.impl.Red;

public class ColorFactory extends AbstractFactory {

    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        } else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        return null;
    }
}
