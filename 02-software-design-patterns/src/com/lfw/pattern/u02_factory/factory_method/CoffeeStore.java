package com.lfw.pattern.u02_factory.factory_method;

/**
 * @version v1.0
 * @ClassName: CoffeeStore
 * @Description: TODO(一句话描述该类的功能)
 * @Author: lfw
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    //点咖啡功能
    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
