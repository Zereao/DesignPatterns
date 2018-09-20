package com.zereao.adapter.demo03;

/**
 * @author Zereao
 * @version 2018/09/18  20:17
 */
public class Main {
    public static void main(String[] args) {
        IUserInfo youngGirl = new UserInfo();
        IUserInfo outerYoungGirl = new OuterUserInfoAdapter();
        for (int i = 0; i < 100; i++) {
            youngGirl.getMobile();
            outerYoungGirl.getMobile();
        }
    }
}
