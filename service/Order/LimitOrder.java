package service.Order;

import entity.OrderPart;
import entity.OrderStatus;
import service.Order.Order;

public class LimitOrder extends Order {
    @Override
    public void setStatus(OrderStatus status) {

    }

    @Override
    public boolean saveInDatabase() {
        return false;
    }

    @Override
    public void addOrderParts(OrderPart parts) {

    }
}
