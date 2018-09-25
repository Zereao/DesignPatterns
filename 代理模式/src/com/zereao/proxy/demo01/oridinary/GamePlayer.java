package com.zereao.proxy.demo01.oridinary;

import com.zereao.proxy.demo01.IGamePlayer;

/**
 * @author Zereao
 * @version 2018/09/25  20:29
 */
public class GamePlayer implements IGamePlayer {
    private String name;

    // 只能访问已有的代理角色，而不能创建新的角色
    public GamePlayer(IGamePlayer gamePlayer, String name) throws Exception {
        if (gamePlayer == null) {
            throw new Exception("不能创建真实角色。");
        } else {
            this.name = name;
        }
    }

    @Override
    public void login(String user, String password) {
        System.out.println("普通代理——用户[" + user + "]登录，使用密码为[" + password + "]");
    }

    @Override
    public void killBoss() {
        System.out.println("普通代理——" + this.name + "在打怪");
    }

    @Override
    public void upgrade() {
        System.out.println("普通代理——" + this.name + "又升了一级");
    }
}
