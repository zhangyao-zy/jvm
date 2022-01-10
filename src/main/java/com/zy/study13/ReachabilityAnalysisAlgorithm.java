package com.zy.study13;

/**
 * @Author: Zy
 * @Date: 2021/12/22 16:37
 *  可达性分析算法 验证finalization机制 可复活的对象
 *  验证目标:
 *      一个被第一次标记为垃圾的对象经过finalize()方法复活的情况
 */
public class ReachabilityAnalysisAlgorithm {
    private static ReachabilityAnalysisAlgorithm obj;

    @Override
    /**
     *重写finalize方法,并在此方法中复活此对象
     * @author Zy
     * @date 2021/12/22
     * @param
     * @return void
     */
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用finalize方法复活对象");
        obj = this;
    }

    public static void main(String[] args) {
        // 初始化obj
        obj = new ReachabilityAnalysisAlgorithm();

        // 置为垃圾对象
        obj = null;
        // 第一次gc
        System.gc();

        try {
            // 线程休眠2s,finalize线程优先级比较低
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(obj == null){
            System.out.println("obj 死亡");
        }else{
            System.out.println("obj 存活");
        }

        // 第二次置为垃圾对象
        obj = null;
        // 第二次gc
        System.gc();
        try {
            // 线程休眠2s,finalize线程优先级比较低
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if(obj == null){
            System.out.println("obj 死亡");
        }else{
            System.out.println("obj 存活");
        }


    }
}
