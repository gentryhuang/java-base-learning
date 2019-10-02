package com.design.pattern.observer.guava;

import com.google.common.eventbus.EventBus;
import org.junit.Test;

/**
 * GuavaEventTest
 *
 * @author shunhua
 * @date 2019-10-02
 */
public class GuavaEventTest {

    @Test
    public void test() {

        /**
         * Guava实现观察者模式的核心类
         */
        EventBus eventBus = new EventBus();
        /**
         * GuavaEvent中有使用@Subscribe注解标注的方法
         */
        GuavaEvent guavaEvent = new GuavaEvent();
        /**
         * GuavaEvent的@Subscribe标注的方法 加入到观察者模式中，作为订阅者即观察者
         */
        eventBus.register(guavaEvent);
        /**
         * 调用EventBus的post方法会回调Subscribe标注的方法
         */
        eventBus.post("post的内容");
    }

}