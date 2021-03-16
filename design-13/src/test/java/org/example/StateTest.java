package org.example;

import org.example.service.OrderData;
import org.example.service.OrderStateHandler;
import org.example.service.model.Order;
import org.junit.Test;

/**
 * @author Feinik
 * @discription
 * @date 2021/3/7
 * @since 1.0.0
 */
public class StateTest {

    @Test
    public void execute() {
        Order order = OrderData.getOrderById("001");
        System.out.println("当前订单：" + order);

        //订单支付
        OrderStateHandler stateHandler = new OrderStateHandler();
        order = OrderData.getOrderById("001");
        stateHandler.doPay(order.getOid(), order.getOrderStatus());

        //订单确认发货   会失败
        order = OrderData.getOrderById("001");
        stateHandler.doReceive(order.getOid(), order.getOrderStatus());

        //订单发货
        order = OrderData.getOrderById("001");
        stateHandler.doDelivery(order.getOid(), order.getOrderStatus());

        //确认发货
        order = OrderData.getOrderById("001");
        stateHandler.doReceive(order.getOid(), order.getOrderStatus());
    }
}
