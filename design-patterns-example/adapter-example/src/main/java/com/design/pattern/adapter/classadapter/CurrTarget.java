package com.design.pattern.adapter.classadapter;

import lombok.extern.slf4j.Slf4j;

/**
 * CurrTarget 目标接口的实现类，可省去，只是作比较
 *
 * @author shunhua
 * @date 2019-09-21
 */
@Slf4j
public class CurrTarget implements Target {

    @Override
    public void run() {
        log.info("目标...run");
    }
}