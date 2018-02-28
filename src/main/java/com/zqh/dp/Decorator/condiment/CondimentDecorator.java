package com.zqh.dp.Decorator.condiment;

import com.zqh.dp.Decorator.Tea;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/28 16:21
 * description: 装饰器
 **/
public abstract class CondimentDecorator implements Tea {
    @Override
    public String getDescription() {
        return "没加任何东西";
    }

    @Override
    public double cost() {
        return 0;// 由子类决定具体的价格
    }
}
