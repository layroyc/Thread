package com.hp.thread;

import java.io.File;

/*
 *遍历 你D盘 的 其中一个文件夹 , 并查找出 文件后缀名带有.class的文件
 *
 */
public class Test02 {
    public static void main(String[] args) {
        File file = new File("D:\\threadTest");
        File[] files = file.listFiles();
        for (File file1 : files) {
            String name = file1.getName();
            String substring = name.substring(name.lastIndexOf("."), name.length());
            if(substring.equals(".class")){
                System.out.println("name = " + name);
            }
        }
    }
}
