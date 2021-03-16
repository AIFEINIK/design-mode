package org.example.service;

import org.example.service.impl.DeliveryState;
import org.example.service.impl.PayState;
import org.example.service.impl.ReceiveState;
import org.example.service.model.OrderStatus;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Feinik
 * @discription 订单状态流转编排
 * @date 2021/3/7
 * @since 1.0.0
 */
public class OrderStateHandler {

    private Map<OrderStatus, OrderState> stateMap = new ConcurrentHashMap<>();

    public OrderStateHandler() {
        stateMap.put(OrderStatus.WAIT_PAY, new PayState());
        stateMap.put(OrderStatus.WAIT_DELIVERY, new DeliveryState());
        stateMap.put(OrderStatus.WAIT_RECEIVE, new ReceiveState());
    }

    public boolean doPay(String oid, OrderStatus currentStatus) {
        return stateMap.get(currentStatus).doPay(oid, currentStatus);
    }

    public boolean doDelivery(String oid, OrderStatus currentStatus) {
        return stateMap.get(currentStatus).doDelivery(oid, currentStatus);
    }

    public boolean doReceive(String oid, OrderStatus currentStatus) {
        return stateMap.get(currentStatus).doReceive(oid, currentStatus);
    }
}
