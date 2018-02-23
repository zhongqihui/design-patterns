package com.zqh.dp.builder;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/23 13:55
 * description: 导演类，每次计划更改，只要更改这个类。
 **/
public class Director {

    // 构造2018-2-23的计划
    public void construct180223() {
        AbstractBuilder builder = new ConcreteBuilder();
        builder.running();
        builder.playBasketBall();
        builder.swimming();

        Plan plan = builder.retPlan();
        plan.printPlan();
    }

    // 构造2018-2-24的计划
    public void construct180224() {
        AbstractBuilder builder = new ConcreteBuilder();
        builder.playBasketBall();
        builder.swimming();

        Plan plan = builder.retPlan();
        plan.printPlan();
    }
}
