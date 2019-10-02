package com.design.pattern.observer.guava;

import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;

/**
 * GuavaEvent
 *
 * @author shunhua
 * @date 2019-10-02
 */
@Slf4j
public class GuavaEvent {

    @Subscribe
    public void subscribe(String event){
        log.info("执行subscribe方法，传入参数是：" + event);
    }
}