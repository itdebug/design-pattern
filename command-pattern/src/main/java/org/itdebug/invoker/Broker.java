package org.itdebug.invoker;

import org.itdebug.command.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker --> setCommand
 * 调用对象类，接受订单并能下订单
 * 使用命令模式
 * 基于命令的类型确定哪个对象执行哪个命令
 */
public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }

        orderList.clear();
    }
}
