package org.example;

import org.example.service.Waiter;
import org.example.service.impl.BjChef;
import org.example.service.impl.BjFood;
import org.example.service.impl.HkChef;
import org.example.service.impl.HkFood;
import org.junit.Test;


public class CommandTest {

    @Test
    public void execute() {
        //初始化一个服务员
        Waiter waiter = new Waiter();

        //开始点菜
        waiter.addOrder(new BjFood(new BjChef()));
        waiter.addOrder(new HkFood(new HkChef()));

        //下单完成
        waiter.orderComplete();
    }
}
