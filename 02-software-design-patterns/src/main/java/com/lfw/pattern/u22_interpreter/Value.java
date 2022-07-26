package com.lfw.pattern.u22_interpreter;

//终结符表达式角色
public class Value extends AbstractExpression {
    private final int value;

    public Value(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }

    @Override
    public String toString() {
        return new Integer(value).toString();
    }
}