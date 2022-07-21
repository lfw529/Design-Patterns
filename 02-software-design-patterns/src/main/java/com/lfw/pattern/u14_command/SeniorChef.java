package com.lfw.pattern.u14_command;

/**
 * @version v1.0
 * @ClassName: SeniorChef
 * @Description: 厨师类
 * @Author: 黑马程序员
 */

// 资深大厨类 是命令的Receiver
public class SeniorChef {

    public void makeFood(String name, int num) {
        System.out.println(num + "份" + name);
    }
}
