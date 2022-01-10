package com.zy.study08;

/**
 * @Author: Zy
 * @Date: 2021/8/26 17:30
 * 测试打印 YGC FullGC
 * 设置堆内存最大为10M -Xms10M -Xmx10M
 * 打印gc详细信息 -XX:+PrintGCDetails
 */
public class GcTest {
    public static void main(String[] args) {
        int i = 0;
        String temp = "test";
        try {
            while (true){
                temp += temp;
                i++;
            }
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println(i);
        }
    }
}
