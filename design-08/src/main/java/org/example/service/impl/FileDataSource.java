package org.example.service.impl;

import org.example.service.DataSource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ZhangPengFei
 * @discription 简单的文件读取
 */
public class FileDataSource implements DataSource {

    private String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void writeData(String data) {
        File file = new File(fileName);
        try(FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public String readData() {
        try(BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)))) {
            return reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
