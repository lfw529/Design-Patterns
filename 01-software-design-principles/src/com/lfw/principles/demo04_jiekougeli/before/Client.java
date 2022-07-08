package com.lfw.principles.demo04_jiekougeli.before;

/**
 * @version v1.0
 * @ClassName: Client
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 黑马程序员
 */
public class Client {
    public static void main(String[] args) {
        XXSafetyDoor door = new XXSafetyDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();
    }
}
