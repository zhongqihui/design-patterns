package com.zqh.dp.builder;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/23 13:48
 * description:
 **/
public class ConcreteBuilder extends AbstractBuilder {
    private Plan plan = new Plan();

    @Override
    public void running() {
        plan.addWay("running");
    }

    @Override
    public void swimming() {
        plan.addWay("swimming");
    }

    @Override
    public void playBasketBall() {
        plan.addWay("playBasketBall");
    }

    @Override
    public Plan retPlan() {
        return plan;
    }
}
