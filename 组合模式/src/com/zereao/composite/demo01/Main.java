package com.zereao.composite.demo01;

import java.util.List;

/**
 * @author Zereao
 * @version 2018/09/27  19:26
 */
public class Main {
    public static void main(String[] args) {
//首先产生了一个根节点
        Branch ceo = new Branch("王大麻子", "总经理", 100000);
        //产生三个部门经理,也就是树枝节点
        Branch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
        Branch salespep = new Branch("马二扔子", "销售部门经理", 20000);
        Branch financeDep = new Branch("赵三驼子", "财务部经理", 30000);
        //再把三个小组长产生出来
        Branch firstDevGroup = new Branch("杨三也斜", "开发一组组长", 5000);
        Branch secondDevGroup = new Branch("吴大棒糙", "开发二组组长", 6000);
        //利下的就是我们这些小兵了,就是路人甲、路人乙
        Leaf a = new Leaf("a", "开发人页", 2000);
        Leaf b = new Leaf("b", "开发人员", 2000);
        Leaf c = new Leaf("c", "开发人员", 2000);
        Leaf d = new Leaf("d", "开发人员", 2000);
        Leaf e = new Leaf("e", "开发人员", 2000);
        Leaf f = new Leaf("f", "开发人员", 2000);
        Leaf g = new Leaf("g", "开发人页", 2000);
        Leaf h = new Leaf("h", "销售人员", 5000);
        Leaf i = new Leaf("i", "销售人员", 4000);
        Leaf j = new Leaf("j", "财务人员", 5000);
        Leaf k = new Leaf("k", "CEo&书", 8000);
        Leaf zhengLaoLiu = new Leaf("郑老六", "研发部副总", 20000);
        //该产生的人都产生出来了, 然后我们怎么组装这保树
        //首先是定义总经理下有三个部门经理
        ceo.addSubordinate(developDep);
        ceo.addSubordinate(salespep);
        ceo.addSubordinate(financeDep);
        //总经理下还有一个秘书
        ceo.addSubordinate(k);
        //定义研发部门下的结构
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);
        //研发部经理下还有一个副总
        developDep.addSubordinate(zhengLaoLiu);
        //看看开发两个开发小组下有什么
        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);
        secondDevGroup.addSubordinate(d);
        secondDevGroup.addSubordinate(e);
        secondDevGroup.addSubordinate(f);
        //再看销售部下的人员情况
        salespep.addSubordinate(g);
        salespep.addSubordinate(h);
        salespep.addSubordinate(i);
        //最后一个财务
        financeDep.addSubordinate(j);
        //打印写完的树状结构
        System.out.println(ceo.getInfo());
        //打印出来整个树形
        getAllSubordinateInfo(ceo.getSubordinate());

        System.out.println("==================================");
        System.out.println(getTreeInfo(ceo));
    }

    private static void getAllSubordinateInfo(List<AbstractCrop> subordinateList) {
        int length = subordinateList.size();
        for (int i = 0; i < length; i++) {
            AbstractCrop node = subordinateList.get(i);
            if (node instanceof Leaf) {
                Leaf employee = (Leaf) node;
                System.out.println(employee.getInfo());
            } else if (node instanceof Branch) {
                Branch branch = (Branch) node;
                System.out.println(branch.getInfo());
                getAllSubordinateInfo(branch.getSubordinate());
            }
        }
    }

    public static String getTreeInfo(Branch root) {
        List<AbstractCrop> subordinateList = root.getSubordinate();
        StringBuilder sb = new StringBuilder();
        for (AbstractCrop crop : subordinateList) {
            if (crop instanceof Leaf) {
                sb.append(crop.getInfo()).append("\n");
            } else if (crop instanceof Branch) {
                sb.append(crop.getInfo()).append("\n").append(getTreeInfo((Branch) crop));
            }
        }
        return sb.toString();
    }
}