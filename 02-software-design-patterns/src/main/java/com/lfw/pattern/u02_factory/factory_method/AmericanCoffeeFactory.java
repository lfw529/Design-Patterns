package com.lfw.pattern.u02_factory.factory_method;

/**
 * @version v1.0
 * @ClassName: AmericanCoffeeFactory
 * @Description: 美式咖啡工厂对象，专门用来生产美式咖啡
 * @Author: lfw
 */
public class AmericanCoffeeFactory implements CoffeeFactory {

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
