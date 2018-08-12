package com.ibm.pattern.factory.method;

import com.ibm.pattern.factory.common.Pizza;

/**
 * 芝加哥奶酪披萨
 * Created by MRH on 2018/8/12.
 */
public class ChicagoCheesePizza extends Pizza {

    public ChicagoCheesePizza(){
        System.out.println("创建了芝加哥风情的Cheese类型的披萨。");
    }
}
