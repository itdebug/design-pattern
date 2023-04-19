package org.example;

import org.example.context.Context;
import org.example.strategy.concrete.OperationAdd;
import org.example.strategy.concrete.OperationMultiply;
import org.example.strategy.concrete.OperationSubtract;

/**
 * Hello world!
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 =" + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 =" + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 =" + context.executeStrategy(10, 5));

    }
}
