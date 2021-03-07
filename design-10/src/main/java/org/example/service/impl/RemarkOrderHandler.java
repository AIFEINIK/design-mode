package org.example.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.example.service.OrderHandler;
import org.example.service.model.GlobalOrderContext;
import org.example.service.model.Order;

/**
 * @author Feinik
 * @discription 白名单过滤
 * @date 2021/3/6
 * @since 1.0.0
 */
public class RemarkOrderHandler extends OrderHandler {

    @Override
    public void orderFilter(GlobalOrderContext context) {
        Order order = context.getOrder();
        if (StringUtils.isNotEmpty(order.getRemark())) {
            System.out.println("订单包含备注");
        }
        super.nextFilter(context);
    }
}
