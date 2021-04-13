package org.example.service;

/**
 * @author ZhangPengFei
 * @discription
 */
public class JdPay implements AggregatePay {

    @Override
    public boolean pay(double amount) {
        System.out.println("京东支付成功");
        return true;
    }

    @Override
    public boolean support(PayType payType) {
        return PayType.JD_PAY == payType;
    }
}
