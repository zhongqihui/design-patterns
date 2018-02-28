package com.zqh.dp.prototype;

import java.util.ArrayList;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/2/23 14:49
 * description: 原型模式主要用于对象的复制，它的核心是就是类图中的原型类Prototype。Prototype类需要具备以下两个条件：
 1、实现Cloneable接口。在java语言有一个Cloneable接口，它的作用只有一个，就是在运行时通知虚拟机可以安全地在实现了此接口的类上使用clone方法。
 在java虚拟机中，只有实现了这个接口的类才可以被拷贝，否则在运行时会抛出CloneNotSupportedException异常。
 2、重写Object类中的clone方法。Java中，所有类的父类都是Object类，Object类中有一个clone方法，作用是返回对象的一个拷贝，
 但是其作用域protected类型的，一般的类无法调用，因此，Prototype类需要将clone方法的作用域修改为public类型。

 原型模式的注意事项：
 1、使用原型模式复制对象不会调用类的构造方法。因为对象的复制是通过调用Object类的clone方法来完成的，它直接在内存中复制数据，
 因此不会调用到类的构造方法。不但构造方法中的代码不会执行，甚至连访问权限都对原型模式无效。还记得单例模式吗？单例模式中，
 只要将构造方法的访问权限设置为private型，就可以实现单例。但是clone方法直接无视构造方法的权限，
 所以，单例模式与原型模式是冲突的，在使用时要特别注意。
 2、深拷贝与浅拷贝。Object类的clone方法只会拷贝对象中的基本的数据类型，对于数组、容器对象、引用对象等都不会拷贝，
 这就是浅拷贝。如果要实现深拷贝，必须将原型模式中的数组、容器对象、引用对象等另行拷贝。
 所以浅拷贝只拷贝了一份引用，而深拷贝则将对象也一起拷贝了。
 **/
public class Main {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype();
        ArrayList list = new ArrayList<>();
        list.add(new Test("1"));
        list.add(new Test("2"));
        prototype.setA(10);
        prototype.setStr("aaa");
        prototype.setList(list);

        ConcretePrototype clone = prototype.clone();
        clone.getList().add("3");

        System.out.println(clone.getA() == prototype.getA());
        System.out.println(clone.getStr() == prototype.getStr());//String 浅克隆，但是效果是深克隆
        clone.setStr("bbb");
        System.out.println(clone.getStr() == prototype.getStr());
        System.out.println(clone.getList() == prototype.getList());

        System.out.println(prototype);
        System.out.println(clone);
    }
}
