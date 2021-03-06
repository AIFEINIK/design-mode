package org.example.service.impl;

import org.example.service.IChef;
import org.example.service.IFood;

/**
 * @author Feinik
 * @discription 香港菜
 * @date 2021/3/6
 * @since 1.0.0
 */
public class HkFood implements IFood {

    private IChef chef;

    public HkFood(IChef chef) {
        this.chef = chef;
    }

    @Override
    public void cook() {
        chef.cooking();
    }
}
