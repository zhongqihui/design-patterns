package com.zqh.dp.decorator.tea;

import com.zqh.dp.decorator.Tea;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/28 16:07
 * description: 红茶，10元
 **/
public class BlackTea implements Tea {
    @Override
    public String getDescription() {
        return "选了一份红茶：";
    }

    @Override
    public double cost() {
        return 10;
    }
}
