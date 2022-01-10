package com.zy.study06;

/**
 * @Author: Zy
 * @Date: 2021/7/30 15:34
 * 默认情况下
 *  堆内存初始大小是物理内存的1/64
 *  堆内存最大是物理内存的1/4
 * 手动设置情况下:
 *  -Xms memory start 设置初始内存
 *  -Xmx memory max 设置最大内存
 * 查看内存使用情况的两种方式
 *  1.
 *      jps查看jvm进程实例id
 *      jstat -gc pid 查看jvm堆内存详情
 *  2.
 *      -XX:+PrintGCDetails 使用jvm参数打印出gc详情,从而查看堆内存的大小
 *
 */
public class HeadSetTest {
    public static void main(String[] args) {
        long initialMemory = Runtime.getRuntime().totalMemory();
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("初始化内存大小:"+initialMemory/1024/1024+"M");
        System.out.println("最大内存大小:"+maxMemory/1024/1024+"M");

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
