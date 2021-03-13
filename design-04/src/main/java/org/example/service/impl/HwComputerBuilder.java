package org.example.service.impl;

import org.example.service.ComputerBuilder;
import org.example.service.bean.Computer;

/**
 * @author ZhangPengFei
 * @discription 具体建造者角色
 */
public class HwComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public HwComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public ComputerBuilder appendCpu() {
        computer.setCpu("hw cpu");
        return this;
    }

    @Override
    public ComputerBuilder appendMemory() {
        computer.setMemory("hw memory");
        return this;
    }

    @Override
    public ComputerBuilder appendDisplayCard() {
        computer.setDisplayCard("hw display card");
        return this;
    }

    @Override
    public ComputerBuilder appendDisk() {
        computer.setDisk("hw disk");
        return this;
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
