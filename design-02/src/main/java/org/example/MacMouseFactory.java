package org.example;

import org.example.service.Mouse;
import org.example.service.impl.MacMouse;

/**
 * @author ZhangPengFei
 * @discription MAC鼠标工厂
 */
public class MacMouseFactory implements MouseFactory {

    @Override
    public Mouse createMouse() {
        return new MacMouse();
    }
}
