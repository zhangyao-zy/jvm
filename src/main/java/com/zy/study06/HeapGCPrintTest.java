package com.zy.study06;

import java.util.Date;

/**
 * @Author: Zy
 * @Date: 2021/7/30 15:04
 * 测试-XX:+PrintGCDetails
 */
public class HeapGCPrintTest {
    public static void main(String[] args) {
        int num = 1;
        num = 2;
        Date data = new Date();
        System.out.println(data);
        System.out.println(1024*7);
    }
}
