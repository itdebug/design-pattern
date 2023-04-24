package org.example;

import org.example.factory.AbstractFactory;
import org.example.factory.impl.ColorFactory;
import org.example.factory.impl.ShapeFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
