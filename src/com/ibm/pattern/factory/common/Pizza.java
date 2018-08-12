package com.ibm.pattern.factory.common;

/**
 * 披萨类
 * Created by MRH on 2018/8/12.
 */
public abstract class Pizza {

    //披萨类型

    public void bake() {
        System.out.println("披萨烘焙中...");
    }

    public void prepare() {
        System.out.println("披萨准备食材中...");
    }

    public void cut() {
        System.out.println("披萨剪切中...");
    }

    public void box() {
        System.out.println("披萨打包中...");
    }

}
