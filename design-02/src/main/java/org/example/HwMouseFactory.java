package org.example;

import org.example.service.Mouse;
import org.example.service.impl.HwMouse;

/**
 * @author ZhangPengFei
 * @discription 华为鼠标工厂
 */
public class HwMouseFactory implements MouseFactory {

    @Override
    public Mouse createMouse() {
        return new HwMouse();
    }
}
