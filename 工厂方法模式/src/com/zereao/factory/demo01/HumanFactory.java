package com.zereao.factory.demo01;

/**
 * 人类创建工厂
 *
 * @author Zereao
 * @version 2018/07/24  10:16
 */
public class HumanFactory extends AbstractHumanFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        T human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }
        return human;
    }
}
