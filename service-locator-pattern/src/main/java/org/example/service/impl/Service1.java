package org.example.service.impl;

import org.example.service.Service;

public class Service1 implements Service {

    public void execute() {
        System.out.println("Executing Service1");
    }

    public String getName() {
        return "Service1";
    }
}
