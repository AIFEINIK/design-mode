package org.example.service.impl;

import org.example.service.OrderData;
import org.example.service.OrderState;
import org.example.service.model.OrderStatus;

/**
 * @author Feinik
 * @discription 订单发货
 * @date 2021/3/7
 * @since 1.0.0
 */
public class DeliveryState implements OrderState {

    @Override
    public boolean doPay(String oid, OrderStatus status) {
        System.out.println("订单编号：" + oid + "已支付，不能重复支付");
        return false;
    }

    @Override
    public boolean doDelivery(String oid, OrderStatus status) {
        OrderData.updateOrder(oid, status, OrderStatus.WAIT_RECEIVE);
        System.out.println("订单编号：" + oid + " 发货成功，当前订单为：" + OrderData.getOrderById(oid));
        return true;
    }

    @Override
    public boolean doReceive(String oid, OrderStatus status) {
        System.out.println("订单编号：" + oid + "未发货，不能确认发货");
        return false;
    }
}
