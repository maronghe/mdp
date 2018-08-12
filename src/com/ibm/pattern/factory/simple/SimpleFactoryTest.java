package com.ibm.pattern.factory.simple;

import com.ibm.pattern.factory.common.Pizza;
import com.ibm.pattern.factory.common.PreviousPizzaStore;

/**
 * 披萨的测试类
 * Created by MRH on 2018/8/12.
 */
public class SimpleFactoryTest {

    public static void main(String[] args){

        Pizza previouspizza = new PreviousPizzaStore().orderPizza("cheese");

    }
}
