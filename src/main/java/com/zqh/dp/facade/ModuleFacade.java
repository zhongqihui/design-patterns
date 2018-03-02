package com.zqh.dp.facade;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/3/2 17:53
 * description: Module 门面
 **/
public class ModuleFacade {

    private ModuleA moduleA = new ModuleA();
    private ModuleB moduleB = new ModuleB();
    private ModuleC moduleC = new ModuleC();

    public void a1() {
        moduleA.a1();
    }

    public void b1() {
        moduleB.b1();
    }

    public void c1() {
        moduleC.c1();
    }
}
