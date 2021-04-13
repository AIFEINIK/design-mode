package org.example.service;

/**
 * @author ZhangPengFei
 * @discription 聚合支付
 */
public interface AggregatePay {

    /**
     * 支付
     * @param amount
     * @return
     */
    boolean pay(double amount);

    /**
     * 是否支持 通过类型找到对应的支付算法
     * @param payType
     * @return
     */
    boolean support(PayType payType);
}
