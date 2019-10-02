package com.design.pattern.singleton.lazynosafe;

/**
 * Test 测试
 *
 * @author shunhua
 * @date 2019-10-02
 */
public class Test {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyThread());
        Thread thread2 = new Thread(new MyThread());
        thread1.start();
        thread2.start();
        System.out.println("program end");
    }

}