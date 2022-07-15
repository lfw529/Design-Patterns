package com.lfw.pattern.u02_factory.factory_method;

/**
 * @version v1.0
 * @ClassName: LatteCoffeeFactory
 * @Description: 拿铁咖啡工厂，专门用来生产拿铁咖啡
 * @Author: lfw
 */
public class LatteCoffeeFactory implements CoffeeFactory {

    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}