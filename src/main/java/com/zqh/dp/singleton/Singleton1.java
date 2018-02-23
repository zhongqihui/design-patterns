package com.zqh.dp.singleton;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/22 9:59
 * description: 单例模式，一个类只用一个实例，并且自动实例化提供给整个系统.
 * 该为单例模式的懒汉式，寓意为需要的时候在进行实例化，需要注意的是，该方式会造成线程不安全问题
 **/
public class Singleton1 {
    //1.私有静态引用
    private static Singleton1 singleton;

    //2.私有构造方法
    private Singleton1() {}

    //3.公有的获取实例的静态方法
    public static Singleton1 getInstance() {
        //使用double check高效率的实现同步
        if(singleton == null) {
            synchronized (Singleton1.class) {
                if (singleton == null) {
                    singleton = new Singleton1();
                }
            }
        }

        return singleton;
    }
}

