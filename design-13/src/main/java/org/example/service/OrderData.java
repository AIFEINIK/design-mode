package org.example.service;

import org.example.service.model.Order;
import org.example.service.model.OrderStatus;

import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Feinik
 * @discription 模拟订单数据
 * @date 2021/3/7
 * @since 1.0.0
 */
public class OrderData {

    private static Map<String, OrderStatus> orderStatusMap = new ConcurrentHashMap<>();

    static {
        orderStatusMap.put("001", OrderStatus.WAIT_PAY);
    }

    public static Order getOrderById(String oid) {
        Order order = new Order();
        order.setOid(oid);
        order.setOrderStatus(orderStatusMap.get(oid));
        return order;
    }

    public static boolean updateOrder(String oid, OrderStatus fromStatus, OrderStatus toStatus) {
        if (fromStatus != orderStatusMap.get(oid)) {
            return false;
        }
        orderStatusMap.put(oid, toStatus);
        return false;
    }
}
