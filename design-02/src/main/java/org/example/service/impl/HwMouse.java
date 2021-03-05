package org.example.service.impl;

import org.example.service.Mouse;

/**
 * @author ZhangPengFei
 * @discription 华为 鼠标
 */
public class HwMouse implements Mouse {

    @Override
    public void scroll() {
        System.out.println("hw mouse");
    }
}
