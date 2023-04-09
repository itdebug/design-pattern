package org.example;

import org.example.observer.Subject;
import org.example.observer.concrete.BinaryObserver;
import org.example.observer.concrete.HexaObserver;
import org.example.observer.concrete.OctalObserver;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
