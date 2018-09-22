package com.zereao.iterator.demo01;

/**
 * 《设计模式之禅》的范例
 *
 * @author Zereao
 * @version 2018/09/22  0:26
 */
public class Main {
    public static void main(String[] args) {
        IProject project = new Project();
        project.add("星球大战项目", 10, 1000);
        project.add("扭转时空项目", 102, 109990);
        project.add("潮人改造项目", 100000, 9999999);
        for (int i = 0; i < 100; i++) {
            project.add("第" + i + "个项目", i * 5, i * 100000);
        }
        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
            IProject p = (IProject) projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}
