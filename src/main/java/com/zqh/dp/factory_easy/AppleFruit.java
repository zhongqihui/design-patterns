package com.zqh.dp.factory_easy;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/22 16:20
 * description: 苹果
 **/
public class AppleFruit implements Fruit {
    public Integer weight;

    public AppleFruit(Integer w) {
        this.weight = w;
        System.out.println("生产了一个苹果");
    }

    @Override
    public void printWeight() {
        System.out.println("我的重量为：" + weight);
    }
}
