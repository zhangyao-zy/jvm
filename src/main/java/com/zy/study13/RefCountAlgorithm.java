package com.zy.study13;

/**
 * @Author: Zy
 * @Date: 2021/12/20 17:12
 * 测试java是否能处理循环引引用问题
 * -XX:+PrintGCDetails 打印gc
 * -Xms10M -Xmx10M 设置堆大小
 */
public class RefCountAlgorithm {
    // 占用空间
    private byte[] data = new byte[5*1024*1024];

    //用来引用另外的变量
    Object reference = null;

    public static void main(String[] args) {
        RefCountAlgorithm ref1 = new RefCountAlgorithm();
        RefCountAlgorithm ref2 = new RefCountAlgorithm();

        // 循环引用
        ref1.reference = ref2;
        ref2.reference = ref1;
        // 切断自身引用,只保留循环引用
        ref1 = null;
        ref2 = null;

        // System.gc() 观察是否回收上面两个对象,如果回收,就证明没有使用引用计数算法.
        System.gc();
    }
}
