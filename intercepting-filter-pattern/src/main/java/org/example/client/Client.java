package org.example.client;

import org.example.manager.FilterManager;

/**
 * 客户端（Client） - Client 是向 Target 对象发送请求的对象。
 */
public class Client {

    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
