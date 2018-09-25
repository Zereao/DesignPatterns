package com.zereao.proxy.demo01.force;

/**
 * @author Zereao
 * @version 2018/09/25  20:47
 */
public class ForceGamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public ForceGamePlayerProxy(IGamePlayer gamePlayer) {
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
    public IGamePlayer getProxy() {
        return this;
    }
}
