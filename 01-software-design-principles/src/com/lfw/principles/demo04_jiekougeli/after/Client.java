package com.lfw.principles.demo04_jiekougeli.after;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 黑马程序员
 */
public class Client {
    public static void main(String[] args) {
        //创建XX安全门对象
        XXSafetyDoor door = new XXSafetyDoor();
        //调用功能
        door.antiTheft();
        door.fireproof();
        door.waterproof();

        System.out.println("============");
        //创建传智安全门对象
        YYSafetyDoor door1 = new YYSafetyDoor();
        //调用功能
        door1.antiTheft();
        door1.fireproof();
    }
}
