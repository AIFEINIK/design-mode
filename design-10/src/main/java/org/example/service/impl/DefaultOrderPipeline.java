package org.example.service.impl;

import org.example.service.OrderHandler;
import org.example.service.OrderPipeline;
import org.example.service.model.GlobalOrderContext;

/**
 * @author Feinik
 * @discription
 * @date 2021/3/6
 * @since 1.0.0
 */
public class DefaultOrderPipeline implements OrderPipeline {

    private OrderHandler handler = new RemarkOrderHandler()
            .appendOrderHandler(new WhitelistOrderHandler());

    @Override
    public void orderFilter(GlobalOrderContext context) {
        handler.orderFilter(context);
    }
}
