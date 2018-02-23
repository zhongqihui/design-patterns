package com.zqh.dp.builder;

import java.util.ArrayList;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/23 13:46
 * description: 计划类
 **/
public class Plan {

    private ArrayList<String> ways = new ArrayList<>();

    // 添加方式到计划中
    public void addWay(String way) {
        ways.add(way);
        System.out.println("将" + way + "加入计划中");
    }

    // 描述自身
    public void printPlan() {
        StringBuffer sb = new StringBuffer();
        for (String way : ways) {
            sb.append(way).append(" >> ");
        }

        System.out.println("我的今天的计划是：" + sb.toString());
    }
}
