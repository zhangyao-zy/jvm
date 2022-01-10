package com.zy.study;

import sun.nio.ch.DirectBuffer;

import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * @Author: Zy
 * @Date: 2021/9/1 20:47
 * 测试直接内存访问
 * io流
 */
public class DirectMemoryTest {

    public static void main(String[] args) {
        System.out.println("分配直接内存");
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1024 * 1024 * 1024);
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        System.out.println("开始释放");
        byteBuffer = null;
        System.gc();
        scanner.next();

    }
}
