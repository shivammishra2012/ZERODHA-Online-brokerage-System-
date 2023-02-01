package service.StockExchange;

import entity.Stock;
import service.Order.Order;

public interface StockSubscriber {

    public void Update(Stock stock , Order order, int id);
}
