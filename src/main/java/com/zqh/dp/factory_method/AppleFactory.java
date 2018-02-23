package com.zqh.dp.factory_method;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/22 16:52
 * description:
 **/
public class AppleFactory implements IFactory {
    @Override
    public Fruit create() {
        return new Apple();
    }
}
