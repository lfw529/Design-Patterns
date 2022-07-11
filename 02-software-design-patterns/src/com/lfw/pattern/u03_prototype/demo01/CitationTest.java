package com.lfw.pattern.u03_prototype.demo01;

/**
 * @version v1.0
 * @ClassName: CitationTest
 * @Description: TODO(一句话描述该类的功能)
 * @Author: lfw
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation c1 = new Citation();
        c1.setName("张三");
        //复制奖状
        Citation c2 = c1.clone();
        //将奖状的名字修改李四
        c2.setName("李四");

        c1.show();
        c2.show();
    }
}
