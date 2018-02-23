package com.zqh.dp.prototype;

import java.util.ArrayList;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/23 14:43
 * description: 具体原型
 **/
public class ConcretePrototype implements Cloneable {
    private int a;
    private String str;
    private ArrayList list = new ArrayList();

    public ConcretePrototype clone()  {
        ConcretePrototype prototype = null;
        try {
            prototype = (ConcretePrototype) super.clone();
            prototype.list = (ArrayList) this.list.clone();// 深拷贝ArrayList
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return prototype;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "a=" + a +
                ", str='" + str + '\'' +
                ", list=" + list +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public ArrayList getList() {
        return list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
