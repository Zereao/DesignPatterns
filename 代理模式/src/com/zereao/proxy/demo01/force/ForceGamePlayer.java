package com.zereao.proxy.demo01.force;

/**
 * @author Zereao
 * @version 2018/09/25  20:41
 */
public class ForceGamePlayer implements IGamePlayer {
    private String name;
    /**
     * 我的代理是谁
     */
    private IGamePlayer gamePlayerProxy;

    public ForceGamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("用户[" + user + "]登录，使用密码为[" + password + "]");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打怪");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + "又升了一级");
        } else {
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        this.gamePlayerProxy = new ForceGamePlayerProxy(this);
        return this.gamePlayerProxy;
    }

    private boolean isProxy() {
        return this.gamePlayerProxy != null;
    }
}
