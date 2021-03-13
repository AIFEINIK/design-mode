package org.example.service.impl;

import org.example.service.MenuComponent;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangPengFei
 * @discription 菜单
 */
public class Menu extends MenuComponent {

    private String name;
    private List<MenuComponent> components = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("---------");
        System.out.println(name);
        for (MenuComponent component : components) {
            component.print();
        }
        System.out.println("----------");
    }

    @Override
    public void add(MenuComponent component) {
        components.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        components.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return components.get(i);
    }

    @Override
    public List<MenuComponent> getChildren() {
        return components;
    }
}
