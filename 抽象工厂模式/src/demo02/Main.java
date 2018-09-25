package demo02;

import demo02.factory.FemaleFactory;
import demo02.factory.HumanFactory;
import demo02.factory.MaleFactory;
import demo02.human.Human;

/**
 * 主方法
 *
 * @author Zereao
 * @version 2018/07/25  10:36
 */
public class Main {
    public static void main(String[] args) {
        // 第一条生产线，男性生产线
        HumanFactory maleFactory = new MaleFactory();
        // 第二条生产线，女性生产线
        HumanFactory femaleFactory = new FemaleFactory();
        // 生产线建立完毕，开始造人
        Human maleYellowHuman = maleFactory.getYellowHuman();
        Human femaleYellowHuman = femaleFactory.getYellowHuman();
        System.out.println("----------第一个男性----------");
        maleYellowHuman.getColor();
        maleYellowHuman.getSex();
        maleYellowHuman.talk();
        System.out.println("----------第一个女性----------");
        femaleYellowHuman.getColor();
        femaleYellowHuman.getSex();
        femaleYellowHuman.talk();
    }
}
