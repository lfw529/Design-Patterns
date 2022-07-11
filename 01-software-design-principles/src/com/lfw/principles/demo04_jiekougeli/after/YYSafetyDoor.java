package com.lfw.principles.demo04_jiekougeli.after;

/**
 * @version v1.0
 * @ClassName: ItcastSafetyDoor
 * @Description: 传智安全门
 * @Author: lfw
 */
public class YYSafetyDoor implements AntiTheft, Fireproof {
    public void antiTheft() {
        System.out.println("防盗");
    }

    public void fireproof() {
        System.out.println("防火");
    }
}
