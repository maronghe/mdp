package com.ibm.pattern.factory.method;

import com.ibm.pattern.factory.common.Pizza;

/**
 * 纽约奶酪披萨
 * Created by MRH on 2018/8/13.
 */
public class NewYorkCheesePizza extends Pizza {
    public NewYorkCheesePizza(){
        System.out.println("创建了纽约风情的Cheese类型的披萨。");
    }
}
