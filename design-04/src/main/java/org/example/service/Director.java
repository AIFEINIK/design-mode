package org.example.service;

import org.example.service.bean.Computer;

/**
 * @author ZhangPengFei
 * @discription 指挥者角色
 */
public class Director {

    public Computer build(ComputerBuilder builder) {
        return builder.appendCpu()
                .appendMemory()
                .appendDisplayCard()
                .appendDisk()
                .getComputer();
    }
}
