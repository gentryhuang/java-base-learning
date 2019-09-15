package com.design.pattern.principle.liskovSubstitutation.inputmethod;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * Child
 *
 * @author shunhua
 * @date 2019-09-15
 */
@Slf4j
public class Child extends Base {
    /**
     * 子类重载
     * 重载的时候入参 Map比 Hashmap宽松，此时执行的时候会执行父类，不执行重载的类
     * @param Map
     */
    public void method(Map Map) {
        System.out.println("执行子类Map方法");
    }
}