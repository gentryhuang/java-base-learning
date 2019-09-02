package com.design.pattern.principle.singleresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * Bird
 *
 * @author shunhua
 * @date 2019-09-02
 */
@Slf4j
public class Bird {

    public void moveMode(String birdName){
        log.info(birdName + "用翅膀飞");
    }

}