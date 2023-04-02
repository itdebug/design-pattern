package org.itdebug;

import org.itdebug.command.BuyStock;
import org.itdebug.command.SellStock;
import org.itdebug.invoker.Broker;
import org.itdebug.received.Stock;

public class CommandPatternDemo {

    /**
     * 使用 Broker 类来演示命令模式
     *
     * @param args
     */
    public static void main(String[] args) {
        Stock stock = new Stock();
        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        broker.placeOrders();
    }
}
