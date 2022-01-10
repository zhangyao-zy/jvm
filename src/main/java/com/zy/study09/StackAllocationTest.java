package com.zy.study09;

import com.zy.study08.GcTest;

/**
 * @Author: Zy
 * @Date: 2021/8/30 20:20
 * 逃逸分析后不会逃逸的对象就可以进行栈上分配
 * 测试栈上分配
 * -Xms1G -Xmx1G -XX:-DoEscapeAnalysis 开启/关闭逃逸分析 -XX:+PrintGCDetails
 */
public class StackAllocationTest {

    public static void testCreateClass(){
        GcTest gcTest = new GcTest();
    }


    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            testCreateClass();
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime-startTime+"ms");

        // 线程sleep
        Thread.sleep(1000000);
    }
}
