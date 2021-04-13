package org.example.service;

/**
 * @author ZhangPengFei
 * @discription
 */
public class WxPay implements AggregatePay {

    @Override
    public boolean pay(double amount) {
        System.out.println("微信支付成功");
        return true;
    }

    @Override
    public boolean support(PayType payType) {
        return PayType.WX_PAY == payType;
    }
}
