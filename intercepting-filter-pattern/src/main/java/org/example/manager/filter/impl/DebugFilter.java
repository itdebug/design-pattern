package org.example.manager.filter.impl;

import org.example.manager.filter.Filter;

public class DebugFilter implements Filter {
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
