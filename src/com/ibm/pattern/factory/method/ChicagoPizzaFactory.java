package com.ibm.pattern.factory.method;

import com.ibm.pattern.factory.common.Pizza;

/**
 * 芝加哥披萨工厂
 * Created by MRH on 2018/8/12.
 */
public class ChicagoPizzaFactory extends SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new ChicagoCheesePizza();
        }else if ("greek".equals(type)){
            pizza = new ChicagoGreekPizza();
        }
        return pizza;
    }
}
