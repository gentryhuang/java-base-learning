package com.design.pattern.decorator.v2;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-09-19
 */
@Slf4j
public class Client {

    @Test
    public void test(){
        AbstractBatterCake batterCake;
        // 装饰煎饼
        batterCake = new BatterCake();
        // 鸡蛋装饰
        batterCake = new EggDecorator(batterCake);
        batterCake = new EggDecorator(batterCake);
        ((EggDecorator) batterCake).handle();
        // 香肠装饰
        batterCake = new SauseDecorator(batterCake);
        ((SauseDecorator) batterCake).handle();
        log.info(batterCake.getDesc() + " 一共卖了" + batterCake.cost() + "元");
    }

}