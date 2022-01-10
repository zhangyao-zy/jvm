package com.zy.study14;

/**
 * @Author: Zy
 * @Date: 2021/12/29 11:13
 * 测试system.gc()方法
 */
public class SystemGcTest {
    public static void main(String[] args) {
        new SystemGcTest();

        // 告知垃圾回收器执行垃圾回收,当并不一定立刻执行
        // 证明如下: 如果执行了就会执行finalize方法,否则程序结束,垃圾回收线程也不会执行
        System.gc();

        // 立刻执行对象的finalize方法
        System.runFinalization();

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("执行了finalize方法");
    }
}
