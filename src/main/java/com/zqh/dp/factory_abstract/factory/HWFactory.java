package com.zqh.dp.factory_abstract.factory;


import com.zqh.dp.factory_abstract.IFactory;
import com.zqh.dp.factory_abstract.PC;
import com.zqh.dp.factory_abstract.Phone;
import com.zqh.dp.factory_abstract.hw.HauWeiMateBookX;
import com.zqh.dp.factory_abstract.hw.Honor9;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/22 17:19
 * description: 华为工厂-专门生产华为产品
 **/
public class HWFactory implements IFactory {
    @Override
    public PC createPC() {
        return new HauWeiMateBookX();
    }

    @Override
    public Phone createPhone() {
        return new Honor9();
    }
}
