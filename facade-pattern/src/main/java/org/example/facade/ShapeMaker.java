package org.example.facade;

import org.example.shape.Shape;
import org.example.shape.concrete.Circle;
import org.example.shape.concrete.Rectangle;
import org.example.shape.concrete.Square;

public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
