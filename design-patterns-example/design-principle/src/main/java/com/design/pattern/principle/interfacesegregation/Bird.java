package com.design.pattern.principle.interfacesegregation;

import lombok.extern.slf4j.Slf4j;

/**
 * Bird
 *
 * @author shunhua
 * @date 2019-09-03
 */
@Slf4j
public class Bird implements IFlyAction {

    @Override
    public void fly() {
        log.info("鸟飞翔");
    }
}