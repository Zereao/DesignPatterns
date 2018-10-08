package com.zereao.visitor.demo02;

/**
 * @author Zereao
 * @version 2018/10/08  10:32
 */
public abstract class AbstractEmployee {
    // 0 代表男性
    public final static int MALE = 0;
    // 1 代表女性
    public final static int FAMALE = 1;

    private String name;

    private int salary;

    private int sex;

    // 我允许一个访问者的访问
    public abstract void accept(IVisitor visitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
