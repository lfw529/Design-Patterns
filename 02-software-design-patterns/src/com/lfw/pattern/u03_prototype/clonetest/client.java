package com.lfw.pattern.u03_prototype.clonetest;

/**
 * @version v1.0
 * @ClassName: client
 * @Description: TODO(一句话描述该类的功能)
 * @Author: lfw
 */
public class client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建一个原型类对象
        RealizeType realizetype = new RealizeType();

        //调用RealizeType类中的clone方法进行对象的克隆
        RealizeType clone = realizetype.clone();

        System.out.println("原型对象和克隆出来的是否是同一个对象？" + (realizetype == clone));
    }
}
