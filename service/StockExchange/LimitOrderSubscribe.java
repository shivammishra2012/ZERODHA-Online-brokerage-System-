package service.StockExchange;

import entity.Stock;
import service.Order.Order;

public class LimitOrderSubscribe implements StockSubscriber {


    @Override
    public void Update(Stock stock, Order order, int id) {

        // calculate tarnsction price
        // make payment

    }
}
