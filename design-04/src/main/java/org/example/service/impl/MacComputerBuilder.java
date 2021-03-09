package org.example.service.impl;

import org.example.service.ComputerBuilder;
import org.example.service.bean.Computer;

/**
 * @author ZhangPengFei
 * @discription 具体建造者角色
 */
public class MacComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public MacComputerBuilder() {
        computer = new Computer();
    }

    @Override
    public ComputerBuilder appendCpu() {
        computer.setCpu("mac cpu");
        return this;
    }

    @Override
    public ComputerBuilder appendMemory() {
        computer.setMemory("mac memory");
        return this;
    }

    @Override
    public ComputerBuilder appendDisplayCard() {
        computer.setDisplayCard("mac display card");
        return this;
    }

    @Override
    public ComputerBuilder appendDisk() {
        computer.setDisk("mac disk");
        return this;
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
