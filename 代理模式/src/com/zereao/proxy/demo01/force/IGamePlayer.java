package com.zereao.proxy.demo01.force;

/**
 * 强制代理的接口类
 *
 * @author Zereao
 * @version 2018/09/25  20:40
 */
public interface IGamePlayer {
    void login(String user, String password);

    void killBoss();

    void upgrade();

    /**
     * 每个人都可以找一下自己的代理
     */
    IGamePlayer getProxy();
}
