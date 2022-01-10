package com.zy.study14;

/**
 * @Author: Zy
 * @Date: 2021/12/29 11:30
 * 测试垃圾回收对象
 * -XX:+PrintGCDetails 打印gc细节
 */
public class SystemGcObjectTest {

    public void test1(){
        // 栈中有引用不会回收
        byte[] buffer = new byte[10*1024*1024];
        System.gc();
    }

    public void test2(){
        // 将引用置空,此时可以回收
        byte[] buffer = new byte[10*1024*1024];
        buffer = null;
        System.gc();
    }

    public void test3(){
        // 代码块中引用并没有被覆盖,局部变量表中深度为2,第一个变量为this,第二个仍然为buffer,有该引用,所以不会被回收
        {
            byte[] buffer = new byte[10*1024*1024];
        }
        System.gc();
    }

    public void test4(){
        // 代码块中buffer引用被被覆盖,局部变量表中深度为2,第一个变量为this,第二个buffer被覆盖为value,引用置空,所以被回收
        {
            byte[] buffer = new byte[10*1024*1024];
        }
        int value = 10;
        System.gc();
    }

    public void test5(){
        // 引用置空 会被回收
        test1();
        System.gc();
    }

    public static void main(String[] args) {
        SystemGcObjectTest systemGcObjectTest = new SystemGcObjectTest();
        systemGcObjectTest.test3();
    }
}
