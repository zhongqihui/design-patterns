package com.zqh.dp.proxy;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/3/5 16:38
 * description: 我的代理,静态代理模式,我自己可以上王者，但是我没空，需要找代练帮我上
 *Proxy（代理角色）：代理对象与真实对象实现相同的接口，所以它能够在任何时刻都能够代理真实对象。代理角色内部包含有对真实对象的引用，所以她可以操作真实对象，同时也可以附加其他的操作，相当于对真实对象进行封装。
 **/
public class MyProxy implements Gamer {
    private My my;

    public MyProxy(My my) {
        this.my = my;
    }

    @Override
    public void playGame() {
        System.out.println("代练上1区王者需要1000元");
        my.playGame();
        System.out.println("获取1000元");
    }
}
