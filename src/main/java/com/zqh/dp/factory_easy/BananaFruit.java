package com.zqh.dp.factory_easy;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/22 16:20
 * description: 香蕉
 **/
public class BananaFruit implements Fruit {
    public Integer weight;

    public BananaFruit(Integer w) {
        this.weight = w;
        System.out.println("生产了一个香蕉");
    }

    @Override
    public void printWeight() {
        System.out.println("我的重量为：" + weight);
    }
}
