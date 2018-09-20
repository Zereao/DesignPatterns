package com.zereao.adapter.demo01;

/**
 * @author Zereao
 * @version 2018/09/17  13:44
 */
public class Main {
    public static void main(String[] args) {
        //和一只狗
        Dog dog = new Dog();

        //将这只狗包装到机器人中，使其有点儿像机器人
        Robot dogRobot = new DogAdapter(dog);

        //然后是机器人叫和跑
        System.out.println("BioRob cry.....");
        dogRobot.cry();
        dogRobot.move();
    }
}
