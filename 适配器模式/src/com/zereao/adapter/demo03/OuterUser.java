package com.zereao.adapter.demo03;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zereao
 * @version 2018/09/18  20:24
 */
public class OuterUser implements IOuterUser {
    @Override
    public Map getUserBaseInfo() {
        Map<String, String> baseInfoMap = new HashMap<>();
        baseInfoMap.put("userName", "这个员工叫混世魔王...");
        baseInfoMap.put("mobile", "手机号码是...");
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        Map<String, String> officeInfo = new HashMap<>();
        officeInfo.put("jobPosition", "职位是...");
        officeInfo.put("officeTelNum", "办公室电话是...");
        return officeInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        Map<String, String> homeInfo = new HashMap<>();
        homeInfo.put("homeTelNum", "家庭号码是...");
        homeInfo.put("homeAddress", "家庭住址是...");
        return homeInfo;
    }
}
