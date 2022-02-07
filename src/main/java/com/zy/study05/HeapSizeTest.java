package com.zy.study05;

import java.util.Arrays;

/**
 * @Author: Zy
 * @Date: 2021/7/29 15:47
 * -Xms20M -Xmx20M
 */
public class HeapSizeTest {
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
