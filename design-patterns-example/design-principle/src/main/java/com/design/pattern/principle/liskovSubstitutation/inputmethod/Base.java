package com.design.pattern.principle.liskovSubstitutation.inputmethod;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

/**
 * Base
 *
 * @author shunhua
 * @date 2019-09-15
 */
@Slf4j
public class Base {
    public void method(HashMap hashMap){
        log.info("执行父类HashMap方法");
    }
}