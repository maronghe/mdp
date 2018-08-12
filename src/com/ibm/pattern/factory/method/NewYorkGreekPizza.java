package com.ibm.pattern.factory.method;

import com.ibm.pattern.factory.common.Pizza;

/**
 * 纽约希腊披萨
 * Created by MRH on 2018/8/13.
 */
public class NewYorkGreekPizza extends Pizza {
    public NewYorkGreekPizza(){
        System.out.println("创建了纽约风情的Cheese类型的披萨。");
    }
}
