package org.example.service;

/**
 * 服务（Service） - 实际处理请求的服务。对这种服务的引用可以在 JNDI 服务器中查找到。
 */
public interface Service {

    public String getName();

    public void execute();

}
