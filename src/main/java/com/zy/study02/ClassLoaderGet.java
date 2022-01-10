package com.zy.study02;

/**
 * @Author: Zy
 * @Date: 2021/7/16 11:33
 */
public class ClassLoaderGet {
    public static void main(String[] args) {
        try {
            // 通过clazz.getClassLoader()方法获取引导类类加载器
            ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
            System.out.println(classLoader);

            // 通过线程获取线程上下文系统类加载器
            ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
            System.out.println(classLoader1);

            // 通过ClassLoader获取 扩展类加载器
            ClassLoader parent = ClassLoader.getSystemClassLoader().getParent();
            System.out.println(parent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
