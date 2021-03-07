package org.example.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.example.service.OrderHandler;
import org.example.service.model.GlobalOrderContext;
import org.example.service.model.Order;

/**
 * @author Feinik
 * @discription 备注订单过滤
 * @date 2021/3/6
 * @since 1.0.0
 */
public class WhitelistOrderHandler extends OrderHandler {

    @Override
    public void orderFilter(GlobalOrderContext context) {
        Order order = context.getOrder();
        if (StringUtils.isNotEmpty(order.getAddress()) && order.getAddress().contains("北京")) {
            System.out.println("白名单校验通过");
            return;
        }
        System.out.println("被名单校验失败");
        super.nextFilter(context);
    }
}
