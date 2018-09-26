package com.zereao.proxy.demo01;

/**
 * 代练者
 *
 * @author Zereao
 * @version 2018/09/25  20:13
 */
public class GamePlayerProxy implements IGamePlayer, IProxy {
    private IGamePlayer gamePlayer;

    /**
     * 通过构造函数传入要对谁进行代练
     */
    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }


    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    @Override
    public void count() {
        System.out.println("费用总共是：150元");
    }
}
