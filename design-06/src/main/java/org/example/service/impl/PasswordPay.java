package org.example.service.impl;

import org.example.service.PayMode;

/**
 * @author ZhangPengFei
 * @discription
 */
public class PasswordPay implements PayMode {

    @Override
    public boolean security(String uid) {
        System.out.println("密码验证");
        return true;
    }
}
