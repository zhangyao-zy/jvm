package com.zy.study12;

/**
 * @Author: Zy
 * @Date: 2021/12/16 16:10
 */
public class TestImpl implements TestA,TestB{
    public  static void test(){
        System.out.println(TestA.a);
    }

    public static void main(String[] args) {
        System.out.println(TestB.a);
    }
}
