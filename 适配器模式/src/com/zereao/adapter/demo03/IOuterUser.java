package com.zereao.adapter.demo03;

import java.util.Map;

/**
 * @author Zereao
 * @version 2018/09/18  20:23
 */
public interface IOuterUser {
    // 获取基本信息，比如名称、性别、手机号码等
    public Map getUserBaseInfo();

    // 工作区域信息
    public Map getUserOfficeInfo();

    // 用户的家庭信息
    public Map getUserHomeInfo();
}
