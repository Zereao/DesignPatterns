package com.zereao.prototype.demo01.samples.sample02;

import java.util.ArrayList;
import java.util.List;

/**
 * 浅拷贝和深拷贝
 *
 * @author Zereao
 * @version 2018/09/22  17:58
 */
public class Thing implements Cloneable {
    private List<String> arrayList = new ArrayList<>();
    /* 如果 arrayList 声明为 final 的，则会报错。要使用clone()方法，则 变量上不能加 final关键字
        private final List<String> arrayList = new ArrayList<>();
     */

    @SuppressWarnings("unchecked")
    @Override
    protected Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
            /*
             *  此处 本来应该是：
             *  private ArrayList<String> arrayList = new ArrayList<>();
             *  ting.arrayList = (List<String>)this.arrayList.clone();
             *  故意按照下面这么写，回一下  向下转型
             */
            thing.arrayList = (List<String>) ((ArrayList<String>) this.arrayList).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }

    // 设置arrayList 的值
    public void setValue(String value) {
        this.arrayList.add(value);
    }

    // 获取ArrayList 的值

    public List<String> getValue() {
        return arrayList;
    }
}
