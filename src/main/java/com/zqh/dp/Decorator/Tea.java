package com.zqh.dp.Decorator;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/28 16:03
 * description: 茶，抽象描述方法和价格
 **/
public interface Tea {
    String description = "无效描述";

    String getDescription();

    double cost();
}
