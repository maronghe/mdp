package com.ibm.pattern.factory.simple;

import com.ibm.pattern.factory.common.Pizza;

/**
 * 希腊披萨
 * Created by MRH on 2018/8/12.
 */
public class GreekPizza extends Pizza {

    public  GreekPizza(){
        System.out.println("创建了Greek类型的披萨。");
    }
}
