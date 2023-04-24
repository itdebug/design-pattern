package org.itdebug.command.concrete;

import org.itdebug.command.Order;
import org.itdebug.received.Stock;

/**
 * ConcreteCommand
 * 实体命令类
 */
public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.sell();
    }
}
