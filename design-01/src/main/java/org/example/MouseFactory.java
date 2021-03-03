package org.example;

import org.example.service.Mouse;
import org.example.service.impl.HwMouse;
import org.example.service.impl.MacMouse;

/**
 * @author ZhangPengFei
 * @discription 鼠标 工厂
 */
public class MouseFactory {

    public static Mouse createMouse(String type) {
        switch (type) {
            case "MAC": return new MacMouse();
            case "HW": return new HwMouse();
        }
        return null;
    }
}
