package org.example;

import org.example.service.MenuComponent;
import org.example.service.impl.Menu;
import org.example.service.impl.MenuItem;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author ZhangPengFei
 * @discription
 */

public class MainTest {

    @Test
    public void t() {
        MenuComponent component = new Menu("所有菜单");

        MenuComponent component1 = new Menu("凉菜");
        MenuComponent component2 = new Menu("热菜");
        MenuComponent component3 = new Menu("冷饮");

        component.add(component1);
        component.add(component2);
        component.add(component3);

        MenuComponent leaf1 = new MenuItem("凉拌黄瓜", BigDecimal.valueOf(12));
        MenuComponent leaf2 = new MenuItem("花生豆", BigDecimal.valueOf(10));
        component1.add(leaf1);
        component1.add(leaf2);

        MenuComponent leaf3 = new MenuItem("古堡鸡丁", BigDecimal.valueOf(20));
        component2.add(leaf3);

        MenuComponent leaf4 = new MenuItem("加多宝", BigDecimal.valueOf(6));
        MenuComponent leaf5 = new MenuItem("9度", BigDecimal.valueOf(8));
        component3.add(leaf4);
        component3.add(leaf5);

        component.print();
    }
}
