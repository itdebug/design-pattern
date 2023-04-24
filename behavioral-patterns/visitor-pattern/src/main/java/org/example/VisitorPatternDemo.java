package org.example;

import org.example.part.concrete.Computer;
import org.example.visitor.concrete.ComputePartDisplayVisitor;

/**
 * Hello world!
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputePartDisplayVisitor());
    }
}
