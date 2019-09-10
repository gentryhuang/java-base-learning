package com.design.pattern.simplefactory;

import lombok.extern.slf4j.Slf4j;

/**
 * Bread
 *
 * @author shunhua
 * @date 2019-09-09
 */
@Slf4j
public class Bread extends Food {

    @Override
    public void produce() {
        log.info("生产面包!");
    }
}