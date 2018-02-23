package com.zqh.dp.factory_abstract;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/22 17:06
 * description: 抽象工厂-产生PC、Phone等抽象产品
 **/
public interface IFactory {
    PC createPC();
    Phone createPhone();
}
