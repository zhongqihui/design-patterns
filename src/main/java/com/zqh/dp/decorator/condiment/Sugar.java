package com.zqh.dp.decorator.condiment;

import com.zqh.dp.decorator.Tea;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/28 16:16
 * description: 茶 + 糖
 **/
public class Sugar extends CondimentDecorator {
    private Tea tea;

    public Sugar(Tea tea) {
        this.tea = tea;
    }

    @Override
    public String getDescription() {
        return tea.getDescription() + "加了糖，";
    }

    @Override
    public double cost() {
        return tea.cost() + 1;
    }
}
