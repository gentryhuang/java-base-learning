package com.design.pattern.singleton.threadlocal;

import lombok.extern.slf4j.Slf4j;

/**
 * ThreadLocalInstanceTest
 *
 * @author shunhua
 * @date 2019-10-03
 */
@Slf4j
public class ThreadLocalInstanceTest {

    public static void main(String[] args) {
        log.info(String.format("main thread %s",ThreadLocalInstance.getInstance()));
        log.info(String.format("main thread %s",ThreadLocalInstance.getInstance()));
        log.info(String.format("main thread %s",ThreadLocalInstance.getInstance()));

        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());

        thread1.start();
        thread2.start();

    }

}