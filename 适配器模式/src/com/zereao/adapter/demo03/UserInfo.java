package com.zereao.adapter.demo03;

/**
 * @author Zereao
 * @version 2018/09/18  20:20
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getUserName() {
        System.out.println("姓名叫做...");
        return null;
    }

    @Override
    public String getHomeAddress() {
        System.out.println("地址是....");
        return null;
    }

    @Override
    public String getMobile() {
        System.out.println("手机号码");
        return null;
    }

    @Override
    public String getOfficeTel() {
        System.out.println("公司电话。。。。");
        return null;
    }

    @Override
    public String getJobPosition() {
        System.out.println("职位是。。。。");
        return null;
    }

    @Override
    public String getHomeTel() {
        System.out.println("家庭号码。。。。");
        return null;
    }
}
