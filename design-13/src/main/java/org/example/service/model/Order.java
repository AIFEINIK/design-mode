package org.example.service.model;

/**
 * @author Feinik
 * @discription
 * @date 2021/3/7
 * @since 1.0.0
 */
public class Order {

    private String oid;
    private OrderStatus orderStatus;

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid='" + oid + '\'' +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
