package com.zereao.responsibilitychain.demo01;

/**
 * @author Zereao
 * @version 2018/09/22  20:08
 */
public class Women implements IWomen {
    /**
     * 通过一个int类型的采纳数来描述妇女的个人情况
     * 1---未出嫁
     * 2---出嫁，丈夫健在
     * 3---夫死
     */
    private int type = 0;

    // 妇女的请示
    private String request = null;

    // 构造函数传递进来请求
    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
