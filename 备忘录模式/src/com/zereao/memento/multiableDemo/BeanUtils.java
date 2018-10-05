package com.zereao.memento.multiableDemo;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * BeanUtils 工具类
 *
 * @author Zereao
 * @version 2018/10/05  22:31
 */
public class BeanUtils {
    // 把 bean的所有属性及数值放入HashMap中
    public static Map<String, Object> backupProp(Object bean) {
        Map<String, Object> result = new HashMap<>(16);
        try {
            // 获得bean的描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            // 获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            // 遍历所有的属性
            for (PropertyDescriptor descriptor : descriptors) {
                // 属性名称
                String fieldName = descriptor.getName();
                // 读取属性的方法
                Method getter = descriptor.getReadMethod();
                // 读取属性值
                Object fieldValue = getter.invoke(bean);
//                Object fieldValue = getter.invoke(bean, new Object(){});
                if (!"class".equalsIgnoreCase(fieldName)) {
                    result.put(fieldName, fieldValue);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    public static void restoreProp(Object bean, Map<String, Object> propMap) {
        try {
            // 获得bean的描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            // 获得属性描述
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            // 遍历所有的属性
            for (PropertyDescriptor descriptor : descriptors) {
                // 属性名称
                String fieldName = descriptor.getName();
                // 如果有这个属性
                if (propMap.containsKey(fieldName)) {
                    //　写属性的方法
                    Method setter = descriptor.getWriteMethod();
                    setter.invoke(bean, propMap.get(fieldName));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
