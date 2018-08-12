package com.ibm.pattern.factory.common;

import com.ibm.pattern.factory.simple.GreekPizza;

/**
 * 之前创建披萨的商店
 * Created by MRH on 2018/8/12.
 */
public class PreviousPizzaStore {

    /**
     * 预定披萨
     * @param type
     * @return
     */
    public Pizza orderPizza(String type){
        Pizza pizza = null;

        /**
         * 当有其他类型的披萨引入的时候，就要修个这个类，
         * 那么就违反了Java的“对修改关闭，对拓展开放”原则。
         * 那么久把创建对象的代码抽离出来。
         */
        if("cheese".equals(type)){
            pizza = new CheesePizza();
        }else if ("greek".equals(type)){
            pizza = new GreekPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
