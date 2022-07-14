package com.lfw.pattern.u07_decorator.demo02;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Test {
    public static void main(String[] args) throws Exception {
        //创建BufferedWriter对象
        //创建FileWriter对象
        FileWriter fw = new FileWriter("02-software-design-patterns\\input\\c.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        //写数据
        bw.write("hello Buffered");

        bw.close();
    }
}
