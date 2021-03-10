package org.example.service;

import java.math.BigDecimal;

/**
 * @author ZhangPengFei
 * @discription 支付渠道
 */
public abstract class Pay {

    /**
     * 桥接模式的核心，抽象类中引用依赖类的接口
     */
    protected PayMode payMode;

    protected Pay(PayMode payMode) {
        this.payMode = payMode;
    }

    /**
     * 支付操作
     * @param uid
     * @param amount
     * @return
     */
    public abstract boolean payAction(String uid, BigDecimal amount);
}
