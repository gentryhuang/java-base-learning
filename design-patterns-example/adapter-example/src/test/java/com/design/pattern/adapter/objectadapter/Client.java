package com.design.pattern.adapter.objectadapter;

import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-09-22
 */
public class Client {

    @Test
    public void test(){
        // 目标类
        Target target = new CurrTarget();
        target.run();

        // 通过适配器把被适配者转换成目标接口类型
        target = new Adapter();
        // 调用适配器实现目标接口的方法，内部调用的是被适配者的方法
        target.run();
    }

}