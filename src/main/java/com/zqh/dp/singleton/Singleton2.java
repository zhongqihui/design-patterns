package com.zqh.dp.singleton;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/3/5 10:07
 * description: 单例模式之静态内部类,
 * 这种写法仍然使用JVM本身机制保证了线程安全问题；由于 SingletonHolder 是私有的，
 * 除了 getInstance() 之外没有办法访问它，因此它是懒汉式的；同时读取实例的时候不会进行同步，
 * 没有性能缺陷；也不依赖 JDK 版本。
 **/
public class Singleton2 {

    private static class SingletonHolder{
        private static final Singleton2 SINGLETON_2 = new Singleton2();
    }

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        return SingletonHolder.SINGLETON_2;
    }
}
