package com.zy.study06;

import java.util.ArrayList;
import java.util.Random;

/**
 * @Author: Zy
 * @Date: 2021/7/30 17:05
 * -Xms600M -Xmx600M
 * 死循环创建byte[]数组对象,将堆空间撑满
 */
public class OOMTest {

    static class ByteTest{
        byte[] bytes;

        public ByteTest(byte[] bytes) {
            this.bytes = bytes;
        }
    }

    public static void main(String[] args) {
        ArrayList<ByteTest> arrayList = new ArrayList<>();
        while (true){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            arrayList.add(new ByteTest(new byte[new Random().nextInt(1024*1024)]));
        }
    }
}
