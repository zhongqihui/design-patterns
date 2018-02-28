package com.zqh.dp.Decorator;

import com.zqh.dp.Decorator.condiment.*;
import com.zqh.dp.Decorator.tea.BlackTea;
import com.zqh.dp.Decorator.tea.GreenTea;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/28 16:05
 * description:
 *  1、装饰者（Decorator）模式又叫包装模式，用组合的方式来拓展对象的功能，是继承关系的一个替代方案，可以动态的将责任附加在对象上，比继承更有弹性。

    2、定义说明：装饰者模式动态地将责任附加到对象上，若要扩展功能，装饰着提供了比继承更富有弹性的替代方案。

    3、装饰者和被装饰对象有相同的超类型。

    4、可以用一个或者多个装饰者包装一个对象。

    5、装饰者可以在所委托被装饰者的行为之前后者之后，加上自己的行为，以达到特定的目的。
 **/
public class Main {
    public static void main(String[] args) {
        Tea t0 = new BlackTea();
        t0 = new Sugar(t0);
        t0 = new Pearl(t0);
        System.out.println(t0.getDescription() + "人民币：" + t0.cost());

        Tea t1 = new GreenTea();
        System.out.println(t1.getDescription() + "人民币：" + t1.cost());

        Tea t2 = new GreenTea();
        t2 = new Coconut(t2);
        t2 = new Milk(t2);
        t2 = new Sugar(t2);// 加双份糖
        t2 = new Sugar(t2);
        System.out.println(t2.getDescription() + "人民币：" + t2.cost());
    }
}
