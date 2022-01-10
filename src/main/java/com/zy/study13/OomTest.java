package com.zy.study13;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Zy
 * @Date: 2021/12/22 22:18
 * 使用JProfiler分析OOm
 * -Xms10M -Xmx10M -XX:+HeapDumpOnOutOfMemoryError
 */
public class OomTest {
    byte[] bytes = new byte[5 * 1024 * 1024];

    public static void main(String[] args) {
        List<OomTest> list = new ArrayList<OomTest>();
        int count = 0;
        try {
            while (true) {
                list.add(new OomTest());
                count++;
            }
        } catch (Throwable e) {
            System.out.println("count =" + count);
            e.printStackTrace();
        }
    }
}
