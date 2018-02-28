package com.zqh.dp.adpater;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/28 15:06
 * description: 狗适配器
 **/
public class Adapter implements Cat {
    private Dog dog;

    public Adapter(Dog dog) {
        this.dog = dog;
    }

    @Override
    public void meow() {
        dog.barks();
    }

    @Override
    public void eat() {
        dog.eat();
    }
}
