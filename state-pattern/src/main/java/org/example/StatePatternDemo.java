package org.example;

import org.example.context.Context;
import org.example.state.concrete.StartState;
import org.example.state.concrete.StopState;

/**
 * Hello world!
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
