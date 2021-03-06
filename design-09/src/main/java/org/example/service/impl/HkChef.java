package org.example.service.impl;

import org.example.service.IChef;

/**
 * @author Feinik
 * @discription 北京菜厨师
 * @date 2021/3/6
 * @since 1.0.0
 */
public class HkChef implements IChef {

    @Override
    public void cooking() {
        System.out.println("北京菜做好了，欢迎品尝");
    }
}
