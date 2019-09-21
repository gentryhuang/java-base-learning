package com.design.pattern.adapter.objectadapter;

import lombok.extern.slf4j.Slf4j;

/**
 * Adapter
 *
 * @author shunhua
 * @date 2019-09-21
 */
@Slf4j
public class Adapter implements Target {
    /**
     * 通过组合
     */
    private Adaptee adaptee = new Adaptee();

    /**
     * 1 适配器是实现了目标类的接口，为了是被适配者和目标类拥有同一接口
     * 2 通过组合的方法，直接在适配器实现目标接口的方法中调用被适配者实例的方法
     */
    @Override
    public void run() {
        // TODO 可以根据具体业务增加其他的操作
        log.info("适配器...run");
        adaptee.adaptee();
    }
}