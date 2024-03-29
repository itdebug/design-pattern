package org.example.state.concrete;

import org.example.context.Context;
import org.example.state.State;

public class StartState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "StartState{}";
    }
}
