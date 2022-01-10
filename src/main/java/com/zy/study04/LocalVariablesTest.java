package com.zy.study04;

import java.util.Date;

/**
 * @Author: Zy
 * @Date: 2021/7/28 14:30
 */
public class LocalVariablesTest {

    public static void main(String[] args) {

    }

    public void test1(Date date, double d) {
        int num = 1;
        date = new Date();
        d = 22.0;
    }
}
