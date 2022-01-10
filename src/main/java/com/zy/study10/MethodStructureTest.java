package com.zy.study10;

/**
 * @Author: Zy
 * @Date: 2021/8/31 9:56
 * 测试方法区反编译效果
 */
public class MethodStructureTest {
    public int num = 0;
    private String str = "测试内部结构";


    public void test1(){
        System.out.println("num"+num);
        System.out.println(str);
    }

    public void test2(){
        int i = 0;
        int j = 0;

        try {
            int k = i/j;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
