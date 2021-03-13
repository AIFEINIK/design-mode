package org.example.service;

/**
 * @author ZhangPengFei
 * @discription 定义通用的数据的读取与写入操作接口
 */
public interface DataSource {

    void writeData(String data);

    String readData();
}
