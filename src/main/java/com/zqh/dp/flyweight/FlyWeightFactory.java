package com.zqh.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/3/5 15:04
 * description: 享元工厂，用于生产享元类
 本角色负责创建和管理享元角色。本角色必须保证享元对象可以被系统适当地共享。
 当一个客户端对象请求一个享元对象的时候，享元工厂角色需要检查系统中是否已经有一个符合要求的享元对象，
 如果已经有了，享元工厂角色就应当提供这个已有的享元对象；如果系统中没有一个适当的享元对象的话，
 享元工厂角色就应当创建一个新的合适的享元对象。
 **/
public class FlyWeightFactory {
    private Map<Character, FlyWeight> map = new HashMap<>();

    public FlyWeightFactory() {
    }

    public FlyWeight factory(Character state) {
        if(map.containsKey(state)) {
            return map.get(state);
        } else {
            FlyWeight flyWeight = new CharacterFlyWeight(state);
            map.put(state, flyWeight);
            return flyWeight;
        }
    }

    public void checkFlyWeight() {
        for (Map.Entry<Character, FlyWeight> next : map.entrySet()) {
            System.out.println(next.getKey() + ":" + next.getValue());
        }
    }
}
