package org.example.manager;

/**
 * Target - Target 对象是请求处理程序。
 */
public class Target {

    public void execute(String request) {
        System.out.println("Executing request: " + request);
    }

}
