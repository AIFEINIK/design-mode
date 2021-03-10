package org.example.service.impl;

import org.example.service.PayMode;

/**
 * @author ZhangPengFei
 * @discription
 */
public class FingerprintPay implements PayMode {

    @Override
    public boolean security(String uid) {
        System.out.println("指纹验证");
        return true;
    }
}
