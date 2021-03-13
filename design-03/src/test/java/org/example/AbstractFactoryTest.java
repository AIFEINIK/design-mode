package org.example;

import org.junit.Test;


public class AbstractFactoryTest {

    @Test
    public void create() {
        PcFactory factory = new MacFactory();
        factory.createMouse().scroll();
        factory.createKeyBoard().enterKey();
    }
}
