package com.zereao.factory.demo01;

import java.lang.reflect.Field;
import java.util.Vector;

/**
 * 获取当前已经加载了的类
 *
 * @author Zereao
 * @version 2018/07/24  13:50
 */
public class Common {
    public static void get() throws NoSuchFieldException, IllegalAccessException {
        Field f = ClassLoader.class.getDeclaredField("classes");
        f.setAccessible(true);
        Vector classes = (Vector) f.get(ClassLoader.getSystemClassLoader());
        for (Object aClass : classes) {
            System.out.println(aClass);
        }
    }
}
