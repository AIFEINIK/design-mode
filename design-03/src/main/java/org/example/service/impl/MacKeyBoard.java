package org.example.service.impl;

import org.example.service.KeyBoard;

/**
 * @author ZhangPengFei
 * @discription
 */
public class MacKeyBoard implements KeyBoard {

    @Override
    public void enterKey() {
        System.out.println("mac keyboard");
    }
}
