package com.lfw.principles.demo04_jiekougeli.before;

/**
 * @version v1.0
 * @ClassName: HeimaSafetyDoor
 * @Description: 黑马品牌的安全门
 * @Author: lfw
 */
public class XXSafetyDoor implements SafetyDoor {
    public void antiTheft() {
        System.out.println("防盗");
    }

    public void fireProof() {
        System.out.println("防火");
    }

    public void waterProof() {
        System.out.println("防水");
    }
}
