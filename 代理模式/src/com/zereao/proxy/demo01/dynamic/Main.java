package com.zereao.proxy.demo01.dynamic;

import com.zereao.proxy.demo01.GamePlayer;
import com.zereao.proxy.demo01.IGamePlayer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Zereao
 * @version 2018/09/26  10:59
 */
public class Main {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer("张三");
        // 定义一个handler
        InvocationHandler handler = new GamePlayIH(gamePlayer);
        ClassLoader c1 = gamePlayer.getClass().getClassLoader();
        // 动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(c1, new Class[]{IGamePlayer.class}, handler);
        proxy.upgrade();
    }
}
