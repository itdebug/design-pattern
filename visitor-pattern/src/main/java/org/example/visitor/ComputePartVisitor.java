package org.example.visitor;

import org.example.part.concrete.Computer;
import org.example.part.concrete.Keyboard;
import org.example.part.concrete.Monitor;
import org.example.part.concrete.Mouse;

public interface ComputePartVisitor {

    public void visit(Computer computer);

    public void visit(Keyboard keyboard);

    public void visit(Mouse mouse);

    public void visit(Monitor monitor);
}
