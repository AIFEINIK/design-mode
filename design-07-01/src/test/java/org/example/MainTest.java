package org.example;

import org.example.service.Component;
import org.example.service.impl.Composite;
import org.example.service.impl.Leaf;
import org.junit.Test;

/**
 * @author ZhangPengFei
 * @discription
 */

public class MainTest {

    @Test
    public void t() {
        Component component = new Composite("component");

        Component component1 = new Composite("composite1");
        Component component2 = new Composite("composite2");

        component.add(component1);
        component.add(component2);

        Component leaf1 = new Leaf("leaf1");
        Component leaf2 = new Leaf("leaf2");
        component1.add(leaf1);
        component1.add(leaf2);

        Component leaf3 = new Leaf("leaf3");
        component2.add(leaf3);

        component.operation();
    }
}
