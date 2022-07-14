package com.lfw.pattern.u02_factory.simple_factory;

/**
 * @version v1.0
 * @ClassName: SimpleCoffeeFactory
 * @Description: 简单咖啡工厂类，用来生产咖啡
 * @Author: lfw
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type) {
        //声明 Coffee 类型的变量，根据不同类型创建不同的coffee子类对象
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }
        return coffee;
    }
}
