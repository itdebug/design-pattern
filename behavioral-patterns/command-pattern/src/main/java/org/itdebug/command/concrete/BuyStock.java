package org.itdebug.command.concrete;

import org.itdebug.command.Order;
import org.itdebug.received.Stock;

/**
 * ConcreteCommand
 * 实体命令类
 */
public class BuyStock implements Order {

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.buy();
    }
}
