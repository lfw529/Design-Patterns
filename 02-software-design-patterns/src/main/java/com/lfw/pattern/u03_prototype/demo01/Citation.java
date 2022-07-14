package com.lfw.pattern.u03_prototype.demo01;

/**
 * @version v1.0
 * @ClassName: Citation
 * @Description: TODO(一句话描述该类的功能)
 * @Author: lfw
 */
public class Citation implements Cloneable {

    //三好学生上的姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println(name + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }
}
