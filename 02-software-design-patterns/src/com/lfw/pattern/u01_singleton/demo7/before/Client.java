package com.lfw.pattern.u01_singleton.demo7.before;

import java.io.*;

public class Client {
    public static void main(String[] args) throws Exception {
        //往文件中写对象
        writeObject2File();
        //从文件中读取对象
        Singleton s1 = readObjectFromFile();
        Singleton s2 = readObjectFromFile();

        //判断两个反序列化后的对象是否是同一个对象
        System.out.println(s1 == s2);
    }

    //从文件读取数据（对象）
    public static Singleton readObjectFromFile() throws Exception {
        //1,创建对象输入流对象
        String relativePath = new File("").getCanonicalPath() + "\\02-software-design-patterns\\output\\a.txt";
        System.out.println(relativePath);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(relativePath));
        //2,读取对象
        Singleton instance = (Singleton) ois.readObject();

        System.out.println(instance);

        //释放资源
        ois.close();

        return instance;
    }

    //向文件中写数据（对象）
    public static void writeObject2File() throws Exception {
        //1,获取Singleton对象
        Singleton instance = Singleton.getInstance();
        //2,创建对象输出流对象
        String relativePath = new File("").getCanonicalPath() + "\\02-software-design-patterns\\output\\a.txt";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(relativePath));
        //3,写对象
        oos.writeObject(instance);
        //4,释放资源
        oos.close();
    }
}

