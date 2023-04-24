package org.example.part.concrete;

import org.example.part.ComputePart;
import org.example.visitor.ComputePartVisitor;

public class Computer implements ComputePart {

    ComputePart[] parts;

    public Computer() {
        parts = new ComputePart[]{new Keyboard(), new Monitor(), new Mouse()};
    }

    public void accept(ComputePartVisitor computePartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computePartVisitor);
        }
        computePartVisitor.visit(this);
    }
}
