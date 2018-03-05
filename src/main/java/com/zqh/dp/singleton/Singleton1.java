package com.zqh.dp.singleton;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/22 9:59
 * description: 单例模式，一个类只用一个实例，并且自动实例化提供给整个系统.
 * 该为单例模式的懒汉式，寓意为需要的时候在进行实例化，需要注意的是，该方式会造成线程不安全问题
 **/
public class Singleton1 {
    //私有静态引用,这里的volatile作用是禁止指令重排序优化，因为singleton = new Singleton1()不是原子操作，步骤：
    //1.给 instance 分配内存
    //2.调用 Singleton 的构造函数来初始化成员变量
    //3.将instance对象指向分配的内存空间（执行完这步 instance 就为非 null 了）
    //但是在 JVM 的即时编译器中存在指令重排序的优化。也就是说上面的第二步和第三步的顺序是不能保证的，
    // 最终的执行顺序可能是 1-2-3 也可能是 1-3-2。如果是后者，则在 3 执行完毕、2 未执行之前，被线程二抢占了，
    // 这时 instance 已经是非 null 了（但却没有初始化），所以线程二会直接返回 instance，然后使用，然后顺理成章地报错。
    private static volatile Singleton1 singleton;

    //私有构造方法
    private Singleton1() {}

    //公有的获取实例的静态方法
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

