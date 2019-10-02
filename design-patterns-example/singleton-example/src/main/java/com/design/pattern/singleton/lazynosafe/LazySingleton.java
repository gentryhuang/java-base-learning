package com.design.pattern.singleton.lazynosafe;

/**
 * LazyDoubleCheckSingleton 懒汉式-线程不安全
 *
 * @author shunhua
 * @date 2019-10-02
 */
public class LazySingleton {
    /**
     * 定义LazySingleton属性
     */
    private static LazySingleton lazySingleton = null;

    /**
     * 指定构造方法是私有的
     */
    private LazySingleton(){}

    /**
     * 全局控制点
     * @return
     */
    public static LazySingleton getInstance(){
        /**
         * 在没有断点干预的情况下，多线程执行和CPU分配有关。为了更清楚的观看多线程执行，可以使用多线程debug来达到控制多个线程的目的
         *
         * 在多线程下有以下几种可能，这里以两个线程解释，线程A和线程B
         *
         * 1 当线程B走到if(lazySingleton == null)时，线程A已经执行创建好了对象，此时线程B直接返回线程A创建的对象
         * 2 当线程B走到if(lazySingleton == null)时，线程A还没有创建好对象即LazySingleton仍然为空，紧接着线程B的if判断通过，当A创建完对象准备返回lazySingleton即执行return lazySingleton时，线程B创建好了对象并赋值给lazySingleton，此时lazySingleton变量的值是线程B创建的对象引用，会覆盖线程A创建的对象对应的引用，最终线程A和线程B返回的虽然是指向同一个对象（线程B创建的）的引用，但是实质上对象已经创建了两次。
         * 3 当线程B走到if(lazySingleton == null)时，线程A还没有创建好对象即LazySingleton仍然为空，仅接着线程B的if判断通过，线程A在线程B创建对象之前返回了，那么最终线程A和线程B都会创建对象，并且返回的对象引用不会相同，它们指向各自创建的对象。
         *
         */
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}