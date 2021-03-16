package org.example.service;

import org.example.service.model.OrderStatus;

/**
 * @author Feinik
 * @discription 抽象订单状态执行事件
 * @date 2021/3/7
 * @since 1.0.0
 */
public interface OrderState {

    /**
     * 订单支付
     * @param oid
     * @param status
     * @return
     */
    boolean doPay(String oid, OrderStatus status);

    /**
     * 订单发货
     * @param oid
     * @param status
     * @return
     */
    boolean doDelivery(String oid, OrderStatus status);

    /**
     * 确认收货
     * @param oid
     * @param status
     * @return
     */
    boolean doReceive(String oid, OrderStatus status);
}
