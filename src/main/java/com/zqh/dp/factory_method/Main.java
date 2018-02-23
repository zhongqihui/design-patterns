package com.zqh.dp.factory_method;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/22 16:53
 * description: 工厂方法模式。
 * 该模式一个产品对应一种工厂；克服了简单工厂模式产品过多导致工厂类庞大的缺点。
 * 但是如果有多种抽象产品，每种抽象产品有多种具体产品，该模式不能解决了。
 **/
public class Main {
    public static void main(String[] args) {
        IFactory appleFactory = new AppleFactory();
        appleFactory.create();

        appleFactory = new BananaFactory();
        appleFactory.create();
    }
}
