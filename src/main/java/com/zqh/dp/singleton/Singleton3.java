package com.zqh.dp.singleton;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/3/5 10:12
 * description: 单例模式之枚举
 * 我们可以通过Singleton3.INSTANCE来访问实例，这比调用getInstance()方法简单多了。创建枚举默认就是线程安全的，
 * 所以不需要担心double checked locking，而且还能防止反序列化导致重新创建新的对象。但是还是很少看到有人这样写，
 * 可能是因为不太熟悉吧。
 **/
public enum Singleton3 {
    INSTANCE;
}
