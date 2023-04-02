package org.itdebug.command;

import org.itdebug.received.Order;
import org.itdebug.received.Stock;

/**
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
