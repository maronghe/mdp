package com.ibm.pattern.factory.method;

import com.ibm.pattern.factory.common.Pizza;

/**
 * 工厂的抽象类
 * Created by MRH on 2018/8/12.
 */
public abstract class SimplePizzaFactory {

    public abstract Pizza createPizza(String type);
}
