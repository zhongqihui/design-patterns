package com.zqh.dp.builder;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/23 13:34
 * description: 抽象建造者，一般包含产品的组建和返回； 引入的目的扩展性更好；
 **/
public abstract class AbstractBuilder {
    public abstract void running();
    public abstract void swimming();
    public abstract void playBasketBall();
    public abstract Plan retPlan();
}
