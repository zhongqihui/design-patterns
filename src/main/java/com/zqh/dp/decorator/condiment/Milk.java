package com.zqh.dp.decorator.condiment;

import com.zqh.dp.decorator.Tea;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/28 17:19
 * description: 牛奶，3.99
 **/
public class Milk extends CondimentDecorator {
    private Tea tea;
    public Milk(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String getDescription() {
        return this.tea.getDescription() + "加了牛奶，";
    }

    @Override
    public double cost() {
        return this.tea.cost() + 3.99;
    }
}
