package org.example.part.concrete;

import org.example.part.ComputePart;
import org.example.visitor.ComputePartVisitor;

public class Keyboard implements ComputePart {

    public void accept(ComputePartVisitor computePartVisitor) {
        computePartVisitor.visit(this);
    }
}
