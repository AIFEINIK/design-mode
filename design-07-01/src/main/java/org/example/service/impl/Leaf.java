package org.example.service.impl;

import org.example.service.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangPengFei
 * @discription
 */
public class Leaf extends Component {

    private List<Component> components = new ArrayList<>();

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println("叶子节点" + name + "的操作");
        for (Component component : components) {
            component.operation();
        }
    }
}
