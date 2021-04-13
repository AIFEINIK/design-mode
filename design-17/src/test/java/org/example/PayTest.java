package org.example;

import org.example.service.PayManager;
import org.example.service.PayType;
import org.junit.Test;

/**
 * @author ZhangPengFei
 * @discription
 */
public class PayTest {

    @Test
    public void execute() {
        PayManager manager = new PayManager();
        manager.doPay(PayType.WX_PAY, 120);
        manager.doPay(PayType.JD_PAY, 100);
    }
}
