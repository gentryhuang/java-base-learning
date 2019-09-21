package com.design.pattern.adapter.classadapter;

import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-09-21
 */
public class Client {

    @Test
    public void test(){
        // 目标类的操作
        Target target = new CurrTarget();
        // 目标类的方法
        target.run();

        // 被适配者通过适配器进行适配，可以和目标类一起工作
        target = new Adapter();
        // 适配者的方法，内部是被适配者的方法
        target.run();
    }
}