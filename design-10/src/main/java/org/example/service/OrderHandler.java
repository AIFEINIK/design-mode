package org.example.service;

import org.example.service.model.GlobalOrderContext;

/**
 * @author Feinik
 * @discription 订单过滤 抽象链
 * @date 2021/3/6
 * @since 1.0.0
 */
public abstract class OrderHandler {

    private OrderHandler next;

    public OrderHandler appendOrderHandler(OrderHandler handler) {
        this.next = handler;
        return this;
    }

    public void nextFilter(GlobalOrderContext context) {
        if (null != next) {
            next.orderFilter(context);
        }
    }

    /**
     * 过滤
     * @param context
     */
    public abstract void orderFilter(GlobalOrderContext context);
}
