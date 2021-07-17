package com.hp.thread;

import java.io.File;

public class Test2 {
    public static void main(String[] args) {
        File file=new File("D:\\threadTest");
        long s=findAll(file);
    }

    private static long findAll(File file) {
        File[] files=file.listFiles();

        for (File file1 : files) {
            //获取遍历后的文件名
            String s1=file1.getName();

            //查找出 文件后缀名带有.class的文件
            //获取最后一个“.”的位置
            int D= s1.lastIndexOf(".");
            //截取位置加1  获取后缀名
            String h1=s1.substring(D+1);
            //拼接后缀名
            String h2="."+h1;
            String zz=".class";

            if (file1.isDirectory()){
                findAll(file1);  //调用自身 递归  如果有目录就接着调用
            }else{
                if (h2.equals(zz)) {
                    System.out.println("文件后缀名带有.class的文件名：" + file1.getName());
                }
            }
        }
        return 0;
    }
}
