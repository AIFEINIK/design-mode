package org.example.service;

/**
 * @author ZhangPengFei
 * @discription 支付方式（如指纹支付，人脸支付，密码支付）
 */
public interface PayMode {

    /**
     * 支付校验
     * @param uid
     * @return
     */
    boolean security(String uid);
}
