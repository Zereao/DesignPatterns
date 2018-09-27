package com.zereao.composite.demo01;

/**
 * @author Zereao
 * @version 2018/09/27  19:14
 */
public abstract class AbstractCrop {
    private String name = "";
    private String position = "";
    private int salary = 0;

    public AbstractCrop(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "AbstractCrop{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
