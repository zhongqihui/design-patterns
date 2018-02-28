package com.zqh.dp.adpater;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/28 15:04
 * description: 加菲猫
 **/
public class GarfieldCat implements Cat {
    @Override
    public void meow() {
        System.out.println("喵呜......");
    }

    @Override
    public void eat() {
        System.out.println("eat......");
    }
}
