package org.example;

import org.example.service.Mouse;
import org.junit.Test;

/**
 * @author ZhangPengFei
 * @discription
 */
public class SimpleFactoryTest {
    @Test
    public void create() {
        Mouse mac = MouseFactory.createMouse("MAC");
        mac.scroll();
    }
}
