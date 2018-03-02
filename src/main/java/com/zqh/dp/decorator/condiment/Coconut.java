package com.zqh.dp.decorator.condiment;

import com.zqh.dp.decorator.Tea;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/28 17:18
 * description: 椰果，0.99
 **/
public class Coconut extends CondimentDecorator {
    private Tea tea;

    public Coconut(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String getDescription() {
        return tea.getDescription() + "加了椰果，";
    }

    @Override
    public double cost() {
        return tea.cost() + 0.99;
    }
}
