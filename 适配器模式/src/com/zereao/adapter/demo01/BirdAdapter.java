package com.zereao.adapter.demo01;

/**
 * @author Zereao
 * @version 2018/09/17  14:06
 */
public class BirdAdapter {
    private Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    public void cry() {
        bird.jiji();
    }

    public void move() {
        bird.fly();
    }
}
