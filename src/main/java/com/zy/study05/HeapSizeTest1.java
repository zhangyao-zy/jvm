package com.zy.study05;

/**
 * @Author: Zy
 * @Date: 2021/7/29 15:47
 * -Xms10M -Xmx10M
 */
public class HeapSizeTest1 {
    public static void main(String[] args) {
        try {
            System.out.println("start............");
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println("end.......");
        }
    }
}
