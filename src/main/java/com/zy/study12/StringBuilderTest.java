package com.zy.study12;

/**
 * @Author: Zy
 * @Date: 2021/12/7 21:39
 * 测试字符串拼接和使用StringBuilder.append方法的时间
 */
public class StringBuilderTest {

    /**
     * 使用拼接的方式拼接100000个字符串
     * @author Zy
     * @date 2021/12/7
     * @param
     * @return void
     */
    public static void stringConcat(){
        long start = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result += "test";
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    /**
     * 创建一个StringBuilder对象,进行append
     * @author Zy
     * @date 2021/12/7
     * @param
     * @return void
     */
    public static void stringBuilderAppend(){
        long start = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder(100000);
        for (int i = 0; i < 100000; i++) {
            builder.append("test");
        }

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void main(String[] args) {
        // 字符串拼接
        StringBuilderTest.stringConcat();

        // append拼接
        StringBuilderTest.stringBuilderAppend();
    }

}
