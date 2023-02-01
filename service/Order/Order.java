package service.Order;


import entity.OrderPart;
import entity.OrderStatus;
import entity.TimeEnforcementType;

import java.util.Date;
import java.util.HashMap;

public abstract class Order {
        private String orderNumber;
        public boolean isBuyOrder;
        private OrderStatus status;
        private TimeEnforcementType timeEnforcement;
        private Date creationTime;
        private HashMap<Integer, OrderPart> parts;

        public abstract void setStatus(OrderStatus status);

        public abstract boolean saveInDatabase() ;

        public abstract void addOrderParts(OrderPart parts);
    }


