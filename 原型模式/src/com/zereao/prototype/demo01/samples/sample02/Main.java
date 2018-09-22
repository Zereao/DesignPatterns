package com.zereao.prototype.demo01.samples.sample02;

/**
 * @author Zereao
 * @version 2018/09/22  17:58
 */
public class Main {
    public static void main(String[] args) {
        // 产生一个对象
        Thing thing = new Thing();
        thing.setValue("张三");
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());

        /*
            输出为什么是 [张三，李四] 呢？Object类提供的clone方法只是拷贝本对象，其内部的数组，引用对象等都不拷贝，
        还是指向原生对象的内部元素地址，这种拷贝就叫做   浅拷贝。虽然内部的  数组 和 引用  对象不拷贝，但是，其他
        的原始类型 比如 int、long、char 等都会被拷贝。对于String类型，处理机制比较特殊，通过  字符串池  在需要的
        时候才在内存中创建新的字符串。
         */
    }
}
