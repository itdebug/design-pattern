package org.example.manager.filter.impl;

import org.example.manager.filter.Filter;

public class AuthenticationFilter implements Filter {

    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
