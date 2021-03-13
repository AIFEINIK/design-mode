package org.example.service.impl;

import org.example.service.MenuComponent;

import java.math.BigDecimal;

/**
 * @author ZhangPengFei
 * @discription 具体菜单项
 */
public class MenuItem extends MenuComponent {

    private String name;
    private BigDecimal price;

    public MenuItem(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("菜单项：" + name + "，价格：" + price);
    }
}
