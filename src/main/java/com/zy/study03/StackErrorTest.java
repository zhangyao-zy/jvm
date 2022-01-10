package com.zy.study03;

/**
 * @Author: Zy
 * @Date: 2021/7/20 14:39
 */
public class StackErrorTest {
    private static int count = 0;

    public static void main(String[] args) {
        System.out.println(count);
        count++;
        main(args);
    }
}
