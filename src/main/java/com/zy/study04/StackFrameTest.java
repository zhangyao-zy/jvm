package com.zy.study04;

/**
 * @Author: Zy
 * @Date: 2021/7/28 11:36
 */
public class StackFrameTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        StackFrameTest test = new StackFrameTest();
        test.clone();
        int num = 1;
    }
}
