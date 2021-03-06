package org.example.service.impl;

import org.example.service.IChef;

/**
 * @author Feinik
 * @discription 香港菜厨师
 * @date 2021/3/6
 * @since 1.0.0
 */
public class BjChef implements IChef {

    @Override
    public void cooking() {
        System.out.println("香港菜做好了，欢迎品尝");
    }
}
