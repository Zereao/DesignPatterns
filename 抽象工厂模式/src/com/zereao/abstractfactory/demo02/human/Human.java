package com.zereao.abstractfactory.demo02.human;

/**
 * 人种接口
 *
 * @author Zereao
 * @version 2018/07/25  10:20
 */
public interface Human {
    // 每个人种都有相应的颜色
    void getColor();

    // 人类会说话
    void talk();

    // 每个人都有性别
    void getSex();
}
