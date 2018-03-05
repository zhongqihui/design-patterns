package com.zqh.dp.singleton;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/22 10:08
 * description:一般情况下直接使用饿汉式就好了，如果明确要求要懒加载（lazy initialization）会倾向于使用静态内部类，如果涉及到反序列化创建对象时会试着使用枚举的方式来实现单例。
 **/
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);

        Singleton1 singleton1 = Singleton1.getInstance();
    }
}
