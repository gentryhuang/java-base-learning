package com.design.pattern.adapter.classadapter;

import lombok.extern.slf4j.Slf4j;

/**
 * Adapter
 *
 * @author shunhua
 * @date 2019-09-21
 */
@Slf4j
public class Adapter extends Adaptee implements Target {
    /**
     * 1、适配者只是实现目标类的接口，并且继承被适配类，这样使得被适配类拥有目标类相容的接口
     * 2、在适配器实现目标接口的方法中调用父类被适配者的方法
     */
    @Override
    public void run() {
        // TODO 这里可以添加其他的操作
        log.info("适配器...run");
        super.adaptee();
    }
}