package org.example.service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Feinik
 * @discription 服务员 命令的调用者
 * @date 2021/3/6
 * @since 1.0.0
 */
public class Waiter {

    private List<IFood> iFoods = new ArrayList<>();

    public void addOrder(IFood food) {
        iFoods.add(food);
    }

    public void orderComplete() {
        for (IFood iFood : iFoods) {
            iFood.cook();
        }
    }
}
