package com.zqh.dp.factory_easy;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/22 16:33
 * description: 简单工厂模式：
 *      该模式的核心是工厂，工厂类有具体的代码实现，客户端不需要关心工厂是怎么生产水果的，我只要给我苹果，你就给我创造出苹果。
 *      降低了耦合性，但是如果水果的品种很多，工厂的创造将会十分庞大。
 **/
public class Main {
    public static void main(String[] args) {
        FruitFactory ff = new FruitFactory();

        Fruit apple = ff.createFruit(AppleFruit.class);
        apple.printWeight();

        Fruit banana = ff.createFruit(BananaFruit.class);
        banana.printWeight();
    }
}
