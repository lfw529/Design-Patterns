package com.lfw.pattern.u02_factory.config_factory;

/**
 * @version v1.0
 * @ClassName: Coffee
 * @Description: 咖啡类
 * @Author: lfw
 */
public abstract class Coffee {

    public abstract String getName();

    //加糖
    public void addSugar() {
        System.out.println("加糖");
    }

    //加奶
    public void addMilk() {
        System.out.println("加奶");
    }
}
