package com.lfw.pattern.u20_visitor.dispatch.doubles;

public class Cat extends Animal {
    public void accept(Execute exe) {
        exe.execute(this);
    }
}