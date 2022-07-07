package com.lfw.demo02_lishidaihuan.before;

import com.lfw.demo02_lishidaihuan.before.Rectangle;

public class Square extends Rectangle {

    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }

    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }
}