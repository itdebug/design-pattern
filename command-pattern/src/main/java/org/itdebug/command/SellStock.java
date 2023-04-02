package org.itdebug.command;

import org.itdebug.received.Order;
import org.itdebug.received.Stock;

/**
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
