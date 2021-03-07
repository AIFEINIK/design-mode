package org.example.service;

import org.example.service.model.GlobalOrderContext;

/**
 * @author Feinik
 * @discription 订单流程编排
 * @date 2021/3/6
 * @since 1.0.0
 */
public interface OrderPipeline {

    /**
     * 订单过滤
     * @param context
     */
    void orderFilter(GlobalOrderContext context);
}
