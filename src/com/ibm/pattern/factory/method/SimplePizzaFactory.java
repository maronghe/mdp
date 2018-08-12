package com.ibm.pattern.factory.method;

import com.ibm.pattern.factory.common.CheesePizza;
import com.ibm.pattern.factory.common.Pizza;
import com.ibm.pattern.factory.simple.GreekPizza;

/**
 * Created by MRH on 2018/8/12.
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new CheesePizza();
        }else if ("greek".equals(type)){
            pizza = new GreekPizza();
        }
        return pizza;
    }
}
