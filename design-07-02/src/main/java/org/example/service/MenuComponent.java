package org.example.service;

import java.util.List;

/**
 * @author ZhangPengFei
 * @discription
 */
public abstract class MenuComponent {

    /**
     * 菜单打印
     */
    public abstract void print();

    public void add(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public List<MenuComponent> getChildren() {
        return null;
    }
}
