package org.example;

import org.example.client.Client;
import org.example.manager.FilterManager;
import org.example.manager.Target;
import org.example.manager.filter.impl.AuthenticationFilter;
import org.example.manager.filter.impl.DebugFilter;

/**
 * 拦截过滤器模式（Intercepting Filter Pattern）
 * 用于对应用程序的请求或响应做一些预处理/后处理。
 * 定义过滤器，并在把请求传给实际目标应用程序之前应用在请求上。
 * 过滤器可以做认证/授权/记录日志，或者跟踪请求，
 * 然后把请求传给相应的处理程序。
 * 以下是这种设计模式的实体。
 */
public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
