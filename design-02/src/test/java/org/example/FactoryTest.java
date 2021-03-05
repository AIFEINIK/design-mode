package org.example;

import org.example.service.Mouse;
import org.junit.Test;


public class FactoryTest {

    @Test
    public void create() {
        MouseFactory factory = new HwMouseFactory();
        Mouse mouse = factory.createMouse();
        mouse.scroll();
    }
}
