package org.example;

import jdk.nashorn.internal.runtime.GlobalConstants;
import org.example.service.OrderPipeline;
import org.example.service.impl.DefaultOrderPipeline;
import org.example.service.model.GlobalOrderContext;
import org.example.service.model.Order;
import org.junit.Test;


public class ChainFilterTest {

    @Test
    public void execute() {
        Order order = new Order();
        order.setAddress("上海");
        order.setRemark("我要退货");
        order.setOid("001");

        GlobalOrderContext context = new GlobalOrderContext();
        context.setOrder(order);

        OrderPipeline pipeline = new DefaultOrderPipeline();
        pipeline.orderFilter(context);
    }
}
