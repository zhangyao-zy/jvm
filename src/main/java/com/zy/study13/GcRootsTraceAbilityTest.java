package com.zy.study13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: Zy
 * @Date: 2021/12/22 20:55
 * 测试GC Roots溯源
 */
public class GcRootsTraceAbilityTest {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        list = null;
        System.gc();
        scanner.next();

    }
}
