package org.example.factory;

import org.example.nullobject.AbstractCustomer;
import org.example.nullobject.impl.NullCustomer;
import org.example.nullobject.impl.RealCustomer;

public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
