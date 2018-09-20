package com.zereao.bridge.demo02;

import com.zereao.bridge.demo02.crop.HouseCrop;
import com.zereao.bridge.demo02.crop.ShanZhaiCrop;
import com.zereao.bridge.demo02.product.House;
import com.zereao.bridge.demo02.product.IPod;

/**
 * 《设计模式之禅》范例
 *
 * @author Zereao
 * @version 2018/09/17  11:23
 */
public class Main {
    public static void main(String[] args) {
        AbstractProduct house = new House();
        System.out.println("--------房地产公司这么运营的--------");
        // 先找到房地产公司
        AbstractCrop houseCrop = new HouseCrop(house);
        houseCrop.makeMoney();

        System.out.println("--------山寨公司这么运行的--------");
        AbstractCrop shanZhaiCrop = new ShanZhaiCrop(new IPod());
        shanZhaiCrop.makeMoney();
    }

}
