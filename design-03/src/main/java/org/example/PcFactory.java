package org.example;

import org.example.service.KeyBoard;
import org.example.service.Mouse;

/**
 * @author ZhangPengFei
 * @discription 抽象工厂
 */
public interface PcFactory {

    Mouse createMouse();

    KeyBoard createKeyBoard();
}
