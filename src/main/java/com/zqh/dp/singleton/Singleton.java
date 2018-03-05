package com.zqh.dp.singleton;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/22 9:59
 * description: 单例模式，一个类只用一个实例，并且自动实例化提供给整个系统.
 *      该为单例模式的饿汉式，寓意为饥饿的，类在初始话的时候，就实例化
 **/
public class Singleton {
    //1.私有静态引用
    private static final Singleton singleton = new Singleton();

    //2.私有构造方法
    private Singleton() {}

    //3.公有的获取实例的静态方法
    public static Singleton getInstance() {
        return singleton;
    }
}
