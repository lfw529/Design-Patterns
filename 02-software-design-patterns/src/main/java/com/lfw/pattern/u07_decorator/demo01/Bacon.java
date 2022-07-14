package com.lfw.pattern.u07_decorator.demo01;

/**
 * @version v1.0
 * @ClassName: Egg
 * @Description: 培根类(具体的装饰者角色)
 * @Author: 黑马程序员
 */
public class Bacon extends Garnish {

    public Bacon(FastFood fastFood) {
        super(fastFood, 2, "培根");
    }

    @Override
    public float cost() {
        //计算价格
        return getPrice() + getFastFood().cost();  //培根的价格 + 快餐的价格
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();   //培根的描述 + 快餐的描述
    }
}
