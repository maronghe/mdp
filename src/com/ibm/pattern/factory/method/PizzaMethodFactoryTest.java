package com.ibm.pattern.factory.method;

import com.ibm.pattern.factory.common.Pizza;
import com.ibm.pattern.factory.common.PizzaStore;

/**
 * 披萨的测试类
 * Created by MRH on 2018/8/12.
 */
public class PizzaMethodFactoryTest {

    public static void main(String[] args) {

        //创建纽约工厂
        NewYorkPizzaFactory newYorkPizzaFactory = new NewYorkPizzaFactory();
        //创建纽约披萨
        Pizza newYorkPizza = new PizzaStore(newYorkPizzaFactory).orderPizza("cheese");

        //创建芝加哥工厂
        ChicagoPizzaFactory chicagoPizzafactory = new ChicagoPizzaFactory();
        //创建芝加哥披萨
        Pizza chicagoPizza = new PizzaStore(chicagoPizzafactory).orderPizza("greek");

    }
}
