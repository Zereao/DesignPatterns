package com.zereao.adapter.demo03;

import java.util.Map;

/**
 * @author Zereao
 * @version 2018/09/18  20:28
 */
public class OuterUserInfoAdapter extends OuterUser implements IUserInfo {
    private Map baseInfo = super.getUserBaseInfo();
    private Map officeInfo = super.getUserOfficeInfo();
    private Map homeInfo = super.getUserHomeInfo();


    @Override
    public String getUserName() {
        String userName = (String) this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAdddress = (String) this.homeInfo.get("homeAddress");
        System.out.println(homeAdddress);
        return homeAdddress;
    }

    @Override
    public String getMobile() {
        String mobile = (String) this.baseInfo.get("mobile");
        System.out.println(mobile);
        return mobile;
    }

    @Override
    public String getOfficeTel() {
        String officeTelNum = (String) this.officeInfo.get("officeTelNum");
        System.out.println(officeTelNum);
        return officeTelNum;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = (String) this.officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTel() {
        String homeTel = (String) this.homeInfo.get("homeTelNum");
        System.out.println(homeTel);
        return homeTel;
    }
}
