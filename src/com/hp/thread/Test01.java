package com.hp.thread;

import java.io.File;
/*
 *遍历 你D盘 的 其中一个文件夹 , 并查找出 文件中带有 java 的 文件
 *
 */
public class Test01 {
    public static void main(String[] args) {
        //指定文件位置
        File file = new File("D:\\threadtest");
        allFile(file);
    }

    private static void allFile(File file) {
        //获取该目录下所有文件
        File[] files = file.listFiles();
        //遍历文件
        for (File file1 : files) {
            //获取文件的名字
            String name = file1.getName();
            //查看名字中是否包含java
            if(name.contains("java")){
                System.out.println("name = " + name);
        }
        }
    }
}
