package com.zqh.dp.flyweight;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/3/5 15:11
 * description: 设计模式-享元模式
 * 享元模式（Flyweight Pattern）：以共享的方式高效的支持大量的细粒度对象。通过复用内存中已存在的对象，
 * 降低系统创建对象实例的性能消耗。
 *
 内部状态：存储在享元对象内部，并且不会随着环境的改变而改变。

 外部状态：它会随着环境的改变而改变，既然这个状态会这样，那么它就不能拿来共享咯，因为在不同状态下，它呈现不一样
 **/
public class Main {
    public static void main(String[] args) {
        FlyWeightFactory factory = new FlyWeightFactory();

        FlyWeight flyWeight = factory.factory('a');
        flyWeight.show("宋体");

        FlyWeight flyWeight1 = factory.factory('a');
        flyWeight1.show("黑体");

        factory.checkFlyWeight();
    }
}
