package org.example.service.impl;

import org.example.service.Component;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangPengFei
 * @discription
 */
public class Composite extends Component {

    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println("组合节点" + name + "的操作");
        for (Component component : components) {
            component.operation();
        }
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return components.get(i);
    }

    @Override
    public List<Component> getChildren() {
        return components;
    }
}
