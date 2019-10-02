package com.design.pattern.singleton.lazynosafe;

import lombok.extern.slf4j.Slf4j;

/**
 * MyThread 实现Runnable接口，实现多线程
 *
 * @author shunhua
 * @date 2019-10-02
 */
@Slf4j
public class MyThread implements Runnable {

    @Override
    public void run() {
        // 获取目标对象
        LazySingleton lazySingleton = LazySingleton.getInstance();
        // 打印当前执行的线程信息和目标对象信息
        log.info(Thread.currentThread().getName() +" "+ lazySingleton);
    }
}