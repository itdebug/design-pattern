package org.example.part;

import org.example.visitor.ComputePartVisitor;

public interface ComputePart {

    public void accept(ComputePartVisitor computePartVisitor);
}
