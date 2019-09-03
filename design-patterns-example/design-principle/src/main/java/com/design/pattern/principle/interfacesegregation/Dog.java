package com.design.pattern.principle.interfacesegregation;

import lombok.extern.slf4j.Slf4j;

/**
 * Dog
 *
 * @author shunhua
 * @date 2019-09-03
 */
@Slf4j
public class Dog implements ISwimAction {

    @Override
    public void swim() {
        log.info("狗游泳");
    }
}