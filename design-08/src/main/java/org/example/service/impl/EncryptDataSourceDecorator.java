package org.example.service.impl;

import org.example.service.BaseDataSourceDecorator;
import org.example.service.DataSource;
import org.example.service.utils.AESUtil;

/**
 * @author ZhangPengFei
 * @discription 具体的加密装饰器
 */
public class EncryptDataSourceDecorator extends BaseDataSourceDecorator {

    public EncryptDataSourceDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    private String encode(String data) {
        try {
            return AESUtil.encrypt(data, "pwd");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String decode(String readData) {
        try {
            return AESUtil.decrypt(readData, "pwd");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
