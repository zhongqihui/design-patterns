package com.zqh.dp.factory_abstract;

import com.zqh.dp.factory_abstract.factory.HWFactory;
import com.zqh.dp.factory_abstract.factory.MIFactory;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/22 17:34
 * description: 抽象工厂模式。
 * 多个抽象产品类（如：手机，个人电脑），每个抽象产品类可以派生出多个具体产品类（小米6，荣耀9；mi笔记本，matebook笔记本）。
 * 一个抽象工厂类，可以派生出多个具体工厂类（小米工厂，华为工厂）。每个具体工厂类可以创建多个具体产品类的实例。
 **/
public class Main {
    public static void main(String[] args) {
        IFactory miFactory = new MIFactory();
        miFactory.createPC();
        miFactory.createPhone();

        IFactory hwFactory = new HWFactory();
        hwFactory.createPhone();
        hwFactory.createPC();
    }
}
