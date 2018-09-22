package com.zereao.iterator.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zereao
 * @version 2018/09/22  0:27
 */
public class Project implements IProject {
    private List<IProject> projectList = new ArrayList<>();
    private String name;
    private int num = 0;
    private int cost = 0;

    public Project() { }

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        return "项目名称是：" + this.name +
                "\t项目人数是：" + this.num +
                "\t项目费用是：" + this.cost;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
