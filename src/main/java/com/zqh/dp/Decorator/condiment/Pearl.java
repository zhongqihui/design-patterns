package com.zqh.dp.Decorator.condiment;

import com.zqh.dp.Decorator.Tea;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/28 17:14
 * description: 珍珠，1.99元
 **/
public class Pearl extends CondimentDecorator {
    private Tea tea;

    public Pearl(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String getDescription() {
        return tea.getDescription() + "加了珍珠，";
    }

    @Override
    public double cost() {
        return tea.cost() + 1.99;
    }
}
