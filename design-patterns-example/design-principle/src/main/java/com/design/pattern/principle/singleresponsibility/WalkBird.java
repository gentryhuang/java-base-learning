package com.design.pattern.principle.singleresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * WalkBird
 *
 * @author shunhua
 * @date 2019-09-02
 */
@Slf4j
public class WalkBird {

    public void moveMode(String birdName){
        log.info(birdName + "陆地奔跑");
    }
}