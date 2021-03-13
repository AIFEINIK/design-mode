package org.example;

import org.example.service.Pay;
import org.example.service.impl.FacePay;
import org.example.service.impl.WxPayImpl;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author ZhangPengFei
 * @discription
 */

public class MainTest {

    @Test
    public void pay() {
        Pay wxPay = new WxPayImpl(new FacePay());
        wxPay.payAction("001", new BigDecimal(10));
    }
}
