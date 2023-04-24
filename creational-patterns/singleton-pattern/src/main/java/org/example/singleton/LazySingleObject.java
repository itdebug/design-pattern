package org.example.singleton;

public class LazySingleObject {

    private static LazySingleObject instance;

    private LazySingleObject() {
    }

    public static LazySingleObject getInstance() {
        if (instance == null) {
            instance = new LazySingleObject();
        }
        return instance;
    }
}
