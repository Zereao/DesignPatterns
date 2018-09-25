package com.zereao.proxy.demo01.force;

/**
 * @author Zereao
 * @version 2018/09/25  20:49
 */
public class Main {
    public static void main(String[] args) {
        IGamePlayer gamePlayer = new ForceGamePlayer("张三");
        // 不能访问，要求使用代理访问
        gamePlayer.upgrade();

        IGamePlayer gamePlayerProxy = new ForceGamePlayerProxy(gamePlayer);
        // 还是不能访问，代理对象是自己new出来的，不行
        gamePlayerProxy.upgrade();

        // 获得指定的代理
        IGamePlayer proxy = gamePlayer.getProxy();
        // 获得了指定的代理，可以访问
        proxy.upgrade();
    }
}
