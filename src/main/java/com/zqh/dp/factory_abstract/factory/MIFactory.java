package com.zqh.dp.factory_abstract.factory;


import com.zqh.dp.factory_abstract.IFactory;
import com.zqh.dp.factory_abstract.PC;
import com.zqh.dp.factory_abstract.Phone;
import com.zqh.dp.factory_abstract.mi.MI6;
import com.zqh.dp.factory_abstract.mi.MIAir13_3;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/22 17:19
 * description: 小米工厂-专门生产小米产品
 **/
public class MIFactory implements IFactory {
    @Override
    public PC createPC() {
        return new MIAir13_3();
    }

    @Override
    public Phone createPhone() {
        return new MI6();
    }
}
