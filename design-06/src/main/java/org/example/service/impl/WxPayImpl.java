package org.example.service.impl;

import org.example.service.Pay;
import org.example.service.PayMode;

import java.math.BigDecimal;

/**
 * @author ZhangPengFei
 * @discription 微信支付
 */
public class WxPayImpl extends Pay {

    public WxPayImpl(PayMode payMode) {
        super(payMode);
    }

    @Override
    public boolean payAction(String uid, BigDecimal amount) {
        boolean security = payMode.security(uid);
        if (security) {
            System.out.println("微信支付成功");
            return true;
        }
        return false;
    }
}
