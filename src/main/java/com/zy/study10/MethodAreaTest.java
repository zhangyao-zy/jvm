package com.zy.study10;

/**
 * @Author: Zy
 * @Date: 2021/8/30 23:04
 * 测试调整jdk1.8的元空间大小
 * -XX:MetaspaceSize=50M
 * -XX:MaxMetaspaceSize=100M
 */
public class MethodAreaTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("start");
        Thread.sleep(1000000);
    }
}
