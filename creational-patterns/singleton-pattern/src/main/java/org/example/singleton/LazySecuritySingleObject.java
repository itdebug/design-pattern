package org.example.singleton;

public class LazySecuritySingleObject {

    private static LazySecuritySingleObject instance;

    private LazySecuritySingleObject() {
    }

    public static synchronized LazySecuritySingleObject getInstance() {
        if (instance == null) {
            instance = new LazySecuritySingleObject();
        }
        return instance;
    }
}
