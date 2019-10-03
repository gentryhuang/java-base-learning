package com.design.pattern.singleton.threadlocal;

import lombok.extern.slf4j.Slf4j;

/**
 * MyThread
 *
 * @author shunhua
 * @date 2019-10-03
 */
@Slf4j
public class MyThread implements Runnable {

    @Override
    public void run() {

        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        log.info(Thread.currentThread().getName() + " " + instance);
    }
}