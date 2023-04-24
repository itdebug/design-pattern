package org.example.factory.impl;

import org.example.factory.AbstractFactory;
import org.example.product.Color;
import org.example.product.Shape;
import org.example.product.impl.Circle;
import org.example.product.impl.Rectangle;
import org.example.product.impl.Square;

public class ShapeFactory extends AbstractFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

    public Color getColor(String color) {
        return null;
    }
}
