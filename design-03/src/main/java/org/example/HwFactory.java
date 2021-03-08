package org.example;

import org.example.service.KeyBoard;
import org.example.service.Mouse;
import org.example.service.impl.HwKeyBoard;
import org.example.service.impl.HwMouse;

/**
 * @author ZhangPengFei
 * @discription 具体工厂
 */
public class HwFactory implements PcFactory {

    @Override
    public Mouse createMouse() {
        return new HwMouse();
    }

    @Override
    public KeyBoard createKeyBoard() {
        return new HwKeyBoard();
    }
}
