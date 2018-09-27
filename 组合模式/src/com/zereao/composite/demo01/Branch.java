package com.zereao.composite.demo01;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Zereao
 * @version 2018/09/27  19:20
 */
public class Branch extends AbstractCrop {
    // 领导下边有哪些下级领导和小兵
    private List<AbstractCrop> subordinateList = new ArrayList<>();

    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubordinate(AbstractCrop crop) {
        this.subordinateList.add(crop);
    }

    public List<AbstractCrop> getSubordinate() {
        return this.subordinateList;
    }
}
