package com.design.pattern.factorymethod;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Bread
 *
 * @author shunhua
 * @date 2019-09-09
 */
@Slf4j
@ToString
public class Bread extends Food {

    @Override
    public void produce() {
        log.info("生产面包!");
    }
}