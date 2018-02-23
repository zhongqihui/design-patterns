package com.zqh.dp.singleton;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/22 10:08
 * description:
 **/
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);

        Singleton1 singleton1 = Singleton1.getInstance();
    }
}
