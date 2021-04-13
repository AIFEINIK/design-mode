package org.example.service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangPengFei
 * @discription 支付管理
 */
public class PayManager {

    private static List<AggregatePay> pays = new ArrayList<>();

    static {
        pays.add(new WxPay());
        pays.add(new AliPay());
        pays.add(new JdPay());
    }

    public boolean doPay(PayType payType, double amount) {
        for (AggregatePay pay : pays) {
            if (pay.support(payType)) {
                return pay.pay(amount);
            }
        }
        throw new IllegalStateException("暂不支持该支付方式" + payType);
    }
}
