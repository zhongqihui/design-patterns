package com.zqh.dp.flyweight;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/3/5 15:01
 * description: 具体的享元类，字母
 实现抽象享元角色所规定的接口。如果有内部状态的话，必须负责为内部状态提供存储空间。
 享元对象的内部状态必须与对象所处的周围环境无关，从而使得享元对象可以在系统内共享。
 有时候具体享元角色又叫做单纯具体享元角色，因为复合享元角色是由单纯具体享元角色通过复合而成的。
 **/
public class CharacterFlyWeight extends FlyWeight{
    private Character character = null;

    // 构造函数，内部状态作为参数传进去
    public CharacterFlyWeight(Character state) {
        this.character = state;
    }

    // 根据外部状态来展示
    @Override
    public void show(String state) {
        System.out.println("我是  " + character + "    当前字体为：" + state);
    }

    @Override
    public String toString() {
        return "CharacterFlyWeight{" +
                "character=" + character +
                '}';
    }
}
