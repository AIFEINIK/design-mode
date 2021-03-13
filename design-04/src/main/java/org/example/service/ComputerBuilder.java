package org.example.service;

import org.example.service.bean.Computer;

/**
 * @author ZhangPengFei
 * @discription 抽象建造者角色
 */
public interface ComputerBuilder {

    ComputerBuilder appendCpu();
    ComputerBuilder appendMemory();
    ComputerBuilder appendDisplayCard();
    ComputerBuilder appendDisk();
    Computer getComputer();
}
