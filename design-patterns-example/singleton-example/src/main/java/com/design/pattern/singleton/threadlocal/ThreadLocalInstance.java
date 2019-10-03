package com.design.pattern.singleton.threadlocal;

/**
 * ThreadLocalInstance
 *
 * @author shunhua
 * @date 2019-10-03
 */
public class ThreadLocalInstance {

    /**
     * 私有构造函数
     */
    private ThreadLocalInstance(){}

    /**
     * ThreadLocal为每个线程绑定一个变量副本，ThreadLocal隔离了多个线程对数据访问的冲突，对多线程资源共享问题，使用以空间换时间因为会为每个线程绑定一个资源副本
     */
    private static final ThreadLocal<ThreadLocalInstance>  threadLocal = new ThreadLocal<ThreadLocalInstance>(){
        /***
         * ThreadLocal初始化方法，不同的线程获取值，这个方法就会被调用一次
         * @return
         */
        @Override
        protected ThreadLocalInstance initialValue() {
            System.out.println("线程：" + Thread.currentThread().getName() + "访问我了");
            return new ThreadLocalInstance();
        }
    };


    /**
     * 提供给外部的访问点
     * @return
     */
    public static ThreadLocalInstance getInstance(){
        // 每个线程获取值的时候拿到的都是独立的副本，这里每个线程获取的是不同的ThreadLocalInstance对象
        return threadLocal.get();
    }



}