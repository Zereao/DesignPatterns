package com.zereao.proxy.demo01.oridinary;

import com.zereao.proxy.demo01.IGamePlayer;

/**
 * @author Zereao
 * @version 2018/09/25  20:33
 */
public class OrdinaryGamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public OrdinaryGamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
}
