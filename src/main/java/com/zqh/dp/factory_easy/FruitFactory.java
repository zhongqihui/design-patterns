package com.zqh.dp.factory_easy;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/22 16:210:31
 * description: 
 **/
public class FruitFactory {
    public Fruit createFruit(Class c) {
        String cName = c.getSimpleName();
        if ("AppleFruit".equals(cName)) {
            return new AppleFruit(100);
        }

        if ("BananaFruit".equals(cName)) {
            return new BananaFruit(50);
        }

        return null;
    }
}
