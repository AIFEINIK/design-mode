package org.example.service;

/**
 * @author ZhangPengFei
 * @discription
 */
public class AliPay implements AggregatePay {

    @Override
    public boolean pay(double amount) {
        System.out.println("支付宝支付成功");
        return true;
    }

    @Override
    public boolean support(PayType payType) {
        return PayType.ALI_PAY == payType;
    }
}
