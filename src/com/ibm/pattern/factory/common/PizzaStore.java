package com.ibm.pattern.factory.common;

import com.ibm.pattern.factory.method.SimplePizzaFactory;

/**
 * 简单工厂创建披萨的商店
 * Created by MRH on 2018/8/12.
 */
public class PizzaStore {

    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }

    /**
     * 预定披萨
     * @param type
     * @return
     */
    public Pizza orderPizza(String type){
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
