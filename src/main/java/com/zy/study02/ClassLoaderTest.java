package com.zy.study02;

/**
 * @Author: Zy
 * @Date: 2021/7/15 8:43
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        // 系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        // 从系统类加载器获取上层加载器 扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);

        // 试图使用扩展类加载器获取上层加载器 引导类加载器
        // 获取不到
        ClassLoader bootStrapClassLoader = extClassLoader.getParent();
        System.out.println(bootStrapClassLoader);

        // 打印结果
        //sun.misc.Launcher$AppClassLoader@18b4aac2 系统类加载器
        //sun.misc.Launcher$ExtClassLoader@4554617c 扩展类加载器
        //null 引导类加载器 无法获取

        // 测试当前类(即用户自定义类)是使用什么类加载器加载的
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);
        // 打印结果
        // sun.misc.Launcher$AppClassLoader@18b4aac2
        // 可以看出是系统类加载器 并且是单例的

        // 测试java核心类库使用什么类加载器 以String为例
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1);
        // 打印结果
        // null
        // 可以看出java核心类库使用的是引导类加载器


    }
}
