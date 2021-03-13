package org.example;

import org.example.service.ComputerBuilder;
import org.example.service.Director;
import org.example.service.bean.Computer;
import org.example.service.impl.MacComputerBuilder;
import org.junit.Test;

/**
 * @author ZhangPengFei
 * @discription
 */
public class BuilderTest {

    @Test
    public void build() {
        ComputerBuilder builder = new MacComputerBuilder();
        Director director = new Director();
        Computer computer = director.build(builder);
        System.out.println(computer);
    }
}
