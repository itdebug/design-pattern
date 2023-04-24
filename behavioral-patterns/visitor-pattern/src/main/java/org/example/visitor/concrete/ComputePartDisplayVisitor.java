package org.example.visitor.concrete;

import org.example.part.concrete.Computer;
import org.example.part.concrete.Keyboard;
import org.example.part.concrete.Monitor;
import org.example.part.concrete.Mouse;
import org.example.visitor.ComputePartVisitor;

public class ComputePartDisplayVisitor implements ComputePartVisitor {

    public void visit(Computer computer) {
        System.out.println("Displaying Computer");
    }

    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard");
    }

    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse");
    }

    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor");
    }
}
