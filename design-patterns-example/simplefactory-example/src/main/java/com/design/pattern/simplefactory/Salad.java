package com.design.pattern.simplefactory;

import lombok.extern.slf4j.Slf4j;

/**
 * Salad
 *
 * @author shunhua
 * @date 2019-09-09
 */
@Slf4j
public class Salad extends Food {

    @Override
    public void produce() {
        log.info("生成沙拉!");
    }
}