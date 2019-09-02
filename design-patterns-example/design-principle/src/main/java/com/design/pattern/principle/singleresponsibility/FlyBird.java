package com.design.pattern.principle.singleresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * FlyBird
 *
 * @author shunhua
 * @date 2019-09-02
 */
@Slf4j
public class FlyBird {

    public void moveMode(String birdName){
        log.info(birdName + "用翅膀飞");
    }
}