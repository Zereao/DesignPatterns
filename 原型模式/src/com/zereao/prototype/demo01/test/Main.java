package com.zereao.prototype.demo01.test;

/**
 * @author Zereao
 * @version 2018/09/26  11:54
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A();
        System.out.println(a.toString());
        A b = a.clone();
        System.out.println(b.toString());

        b.setaInt(12);
        b.setaInteger(85);
        b.setIntegers(new Integer[]{5, 3, 21, 2312, 3});
        b.setInts(new int[]{12, 23, 34, 56543});
        b.setStr("abcde");
        b.setStrs(new String[]{"12345676", "jhaishjfiaqjhiw"});
        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
