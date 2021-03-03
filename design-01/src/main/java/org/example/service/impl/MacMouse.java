package org.example.service.impl;

import org.example.service.Mouse;

/**
 * @author ZhangPengFei
 * @discription Mac 鼠标
 */
public class MacMouse implements Mouse {

    @Override
    public void scroll() {
        System.out.println("mac mouse");
    }
}
