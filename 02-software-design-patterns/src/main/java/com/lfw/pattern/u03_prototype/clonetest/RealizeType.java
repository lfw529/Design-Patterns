package com.lfw.pattern.u03_prototype.clonetest;

/**
 * @version v1.0
 * @ClassName: RealizeType
 * @Description: TODO(一句话描述该类的功能)
 * @Author: lfw
 */
public class RealizeType implements Cloneable {

    public RealizeType() {
        System.out.println("具体的原型对象创建完成！");
    }

    @Override
    public RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");

        return (RealizeType) super.clone();
    }
}
