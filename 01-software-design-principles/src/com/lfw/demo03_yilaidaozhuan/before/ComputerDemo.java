package com.lfw.demo03_yilaidaozhuan.before;

/**
 * @version v1.0
 * @ClassName: ComputerDemo
 * @Description: TODO(一句话描述该类的功能)
 * @Author: 黑马程序员
 */
public class ComputerDemo {
    public static void main(String[] args) {
        //创建组件对象
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        IntelCpu cpu = new IntelCpu();
        KingstonMemory memory = new KingstonMemory();

        //创建计算机对象
        Computer c = new Computer();
        //组装计算机
        c.setCpu(cpu);
        c.setHardDisk(hardDisk);
        c.setMemory(memory);

        //运行计算机
        c.run();
    }
}