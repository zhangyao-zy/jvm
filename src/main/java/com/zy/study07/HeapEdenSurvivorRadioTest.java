package com.zy.study07;

/**
 * @Author: Zy
 * @Date: 2021/8/3 11:42
 * -XX:NewRatio 设置老年代:新生代比例 默认2:1
 * -XX:SurvivorRatio 设置新生代中伊甸园区:S0:S1比例 默认8:1:1
 * -XX:-UseAdaptSizePolicy 禁用新生代中伊甸园区:S0:S1比例内存自适应策略(暂时无用)
 */
public class HeapEdenSurvivorRadioTest {

    public static void main(String[] args) {
        try {
            Thread.sleep(10000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
