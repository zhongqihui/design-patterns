package com.zqh.dp.Decorator.tea;

import com.zqh.dp.Decorator.Tea;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/28 16:07
 * description: 绿茶，8元
 **/
public class GreenTea implements Tea {
    @Override
    public String getDescription() {
        return "选了一份绿茶：";
    }

    @Override
    public double cost() {
        return 8;
    }
}
