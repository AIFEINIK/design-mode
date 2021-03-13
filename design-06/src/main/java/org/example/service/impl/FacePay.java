package org.example.service.impl;

import org.example.service.PayMode;

/**
 * @author ZhangPengFei
 * @discription
 */
public class FacePay implements PayMode {

    @Override
    public boolean security(String uid) {
        System.out.println("人脸验证");
        return true;
    }
}
