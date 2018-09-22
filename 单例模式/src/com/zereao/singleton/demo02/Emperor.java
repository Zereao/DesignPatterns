package com.zereao.singleton.demo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 《设计模式之禅》范例
 * 固定数量的皇帝类
 *
 * @author Zereao
 * @version 2018/09/21  22:59
 */
public class Emperor {
    // 定义最多能产生的实例数量
    private static int maxNumOfEmperor = 2;
    // 使用一个List来容纳每个对象的name属性
    private static List<String> nameList = new ArrayList<>();
    // 定义一个List来容纳所有的皇帝实例
    private static List<Emperor> emperorList = new ArrayList<>();
    private static int countNumOfEmperor = 0;

    // 生产所有对象
    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new Emperor("皇" + (i + 1) + "帝"));
        }
    }

    // 私有构造
    private Emperor(String name) {
        nameList.add(name);
    }

    public static Emperor getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }

    public static void say() {
        System.out.println(nameList.get(countNumOfEmperor));
    }
}
