package org.example.nullobject.impl;

import org.example.nullobject.AbstractCustomer;

public class NullCustomer extends AbstractCustomer {

    public boolean isNil() {
        return true;
    }

    public String getName() {
        return "Not Available in customer Database";
    }
}
