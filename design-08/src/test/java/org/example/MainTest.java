package org.example;

import org.example.service.DataSource;
import org.example.service.impl.EncryptDataSourceDecorator;
import org.example.service.impl.FileDataSource;
import org.junit.Test;

/**
 * @author ZhangPengFei
 * @discription
 */

public class MainTest {

    @Test
    public void t() {
        String fileName = "F://test.txt";
        //为装饰前
        DataSource fileDataSource = new FileDataSource(fileName);
        fileDataSource.writeData("hello word");
        String readData = fileDataSource.readData();
        System.out.println(readData);

        //使用加密装饰
        fileName = "F://test1.txt";
        DataSource encryptDataSourceDecorator = new EncryptDataSourceDecorator(new FileDataSource(fileName));
        encryptDataSourceDecorator.writeData("hello feinik");

        String read = encryptDataSourceDecorator.readData();
        System.out.println(read);
    }
}
