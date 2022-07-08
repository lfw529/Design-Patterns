package com.lfw.principles.demo01_kaibiyuanze;

/**
 * @version v1.0
 * @ClassName: SougouInput
 * @Description: 搜狗输入法
 * @Author: lfw
 */
public class SougouInput {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
