package org.example.service.model;

/**
 * @author Feinik
 * @discription 订单状态
 * @date 2021/3/7
 * @since 1.0.0
 */
public enum OrderStatus {
    /**
     * 待支付
     */
    WAIT_PAY,

    /**
     * 待发货
     */
    WAIT_DELIVERY,

    /**
     * 待收货
     */
    WAIT_RECEIVE,

    /**
     * 已完成
     */
    COMPLETED
}
