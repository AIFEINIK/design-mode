package org.example;

import org.example.service.KeyBoard;
import org.example.service.Mouse;
import org.example.service.impl.MacKeyBoard;
import org.example.service.impl.MacMouse;

/**
 * @author ZhangPengFei
 * @discription 具体工厂
 */
public class MacFactory implements PcFactory {

    @Override
    public Mouse createMouse() {
        return new MacMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new MacKeyBoard();
    }
}
