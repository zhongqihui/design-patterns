package com.zqh.dp.proxy;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/3/5 16:40
 * description:
 **/
public class Main {
    public static void main(String[] args) {
        Gamer gamer = new MyProxy(new My());
        gamer.playGame();
    }
}
