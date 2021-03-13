package org.example.service;

import org.example.service.DataSource;

/**
 * @author ZhangPengFei
 * @discription 抽象基础装饰器
 */
public class BaseDataSourceDecorator implements DataSource {

    private DataSource dataSource;

    public BaseDataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return dataSource.readData();
    }
}
