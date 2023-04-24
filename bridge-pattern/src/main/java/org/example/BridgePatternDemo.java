package org.example;

import org.example.bridge.concrete.GreenCircle;
import org.example.bridge.concrete.RedCircle;
import org.example.shape.Shape;
import org.example.shape.impl.Circle;

/**
 * Hello world!
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
