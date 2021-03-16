package org.example.service.impl;

import org.example.service.OrderData;
import org.example.service.OrderState;
import org.example.service.model.OrderStatus;

/**
 * @author Feinik
 * @discription 订单支付
 * @date 2021/3/7
 * @since 1.0.0
 */
public class PayState implements OrderState {

    @Override
    public boolean doPay(String oid, OrderStatus status) {
        OrderData.updateOrder(oid, status, OrderStatus.WAIT_DELIVERY);
        System.out.println("订单编号：" + oid + " 支付成功，当前订单为：" + OrderData.getOrderById(oid));
        return true;
    }

    @Override
    public boolean doDelivery(String oid, OrderStatus status) {
        System.out.println("订单编号：" + oid + "未支付，不能发货");
        return false;
    }

    @Override
    public boolean doReceive(String oid, OrderStatus status) {
        System.out.println("订单编号：" + oid + "未支付，不能确认发货");
        return false;
    }
}
