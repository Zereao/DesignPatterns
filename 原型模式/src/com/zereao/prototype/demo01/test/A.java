package com.zereao.prototype.demo01.test;

import java.util.Arrays;

/**
 * @author Zereao
 * @version 2018/09/26  11:49
 */
public class A implements Cloneable {
    private int aInt = 5;
    private Integer aInteger = 10;

    private Integer[] integers = new Integer[]{1, 2, 3};
    private int[] ints = new int[]{1, 2, 3, 4, 5};

    String str = "12345";
    String[] strs = new String[]{"12345", "abcde"};

    @Override
    protected A clone() throws CloneNotSupportedException {
        A a = null;
        try {
            a = (A) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public String toString() {
        return "A{" +
                "aInt=" + aInt +
                ", aInteger=" + aInteger +
                ", integers=" + Arrays.toString(integers) +
                ", ints=" + Arrays.toString(ints) +
                ", str='" + str + '\'' +
                ", strs=" + Arrays.toString(strs) +
                '}';
    }

    public int getaInt() {
        return aInt;
    }

    public void setaInt(int aInt) {
        this.aInt = aInt;
    }

    public Integer getaInteger() {
        return aInteger;
    }

    public void setaInteger(Integer aInteger) {
        this.aInteger = aInteger;
    }

    public Integer[] getIntegers() {
        return integers;
    }

    public void setIntegers(Integer[] integers) {
        this.integers = integers;
    }

    public int[] getInts() {
        return ints;
    }

    public void setInts(int[] ints) {
        this.ints = ints;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String[] getStrs() {
        return strs;
    }

    public void setStrs(String[] strs) {
        this.strs = strs;
    }
}
