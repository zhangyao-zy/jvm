package com.zy.study09;

/**
 * @Author: Zy
 * @Date: 2021/8/30 21:00
 * 标量替换测试
 * jvm参数 -Xms256M -Xmx256M -XX:+PrintGCDetails -XX:-EliminateAllocations
 */
public class ScalarReplaceTest {

    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 10000000; i++) {
            allocation();
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime-startTime+"ms");

        // 线程sleep
        Thread.sleep(1000000);
    }

    public static void allocation(){
        Point point = new Point(2,3);
        int a = point.x + point.y;
    }
}
