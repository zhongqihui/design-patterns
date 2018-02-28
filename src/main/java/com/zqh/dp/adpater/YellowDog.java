package com.zqh.dp.adpater;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/28 15:01
 * description:  黄狗
 **/
public class YellowDog implements Dog {
    @Override
    public void barks() {
        System.out.println("汪汪汪......");
    }

    @Override
    public void eat() {
        System.out.println("eat.......");
    }
}
