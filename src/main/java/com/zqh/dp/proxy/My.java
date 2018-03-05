package com.zqh.dp.proxy;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/3/5 16:33
 * description: RealSubject（真实角色）：它代表着真实对象，是我们最终要引用的对象
 **/
public class My implements Gamer {

    @Override
    public void playGame() {
        System.out.println("玩英雄联盟冲1区王者中....");
    }
}
