package service.StockExchange;

import entity.Stock;
import service.Order.Order;

import java.util.List;

public class StockPublisher {

    public StockPublisher(List<StockSubscriber> subscribers) {
        this.subscribers = subscribers;
    }

    public void notifyALLObservers(Stock stock, Order order,int id)
    {
        for(StockSubscriber stockSubscriber:subscribers)
        {
            stockSubscriber.Update(stock,order,id);
        }
    }

    public Stock getstock(Stock stock, Order order,int id)
    {

        // keep fetching the current prices from stock exchange  of stock and notify all the observers .
        // observers based on order type like limitorder,MarketOrder e.t.c
        notifyALLObservers(stock,order,id);


        return null;
    }

    private List<StockSubscriber> subscribers;


    public void add(StockSubscriber stockSubscriber)
    {
        this.subscribers.add(stockSubscriber);

    }
    public void Unsubscribe(StockSubscriber stockSubscriber)
    {

    }
    public void Subscribe(StockSubscriber stockSubscriber)
    {

    }



}
