package com.zy.study12;

/**
 * @Author: Zy
 * @Date: 2021/12/9 20:04
 * 理解String
 */
public class StringTest {
    public static void main(String[] args) {
        // 创建了多少个对象
//        String test = new String("test");

        // 创建了多少个对象
        String test = new String("hello") + new String("world");
        String intern = test.intern();

        String test1 = "helloworld";
        System.out.println(intern == test);

    }

}
