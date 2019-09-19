package com.design.pattern.decorator.v1;

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
        // 煎饼
        BatterCake batterCake = new BatterCake();
        log.info(batterCake.getDesc() + "销售价格为 " + batterCake.cost());

        // 鸡蛋煎饼
        BatterCakeWithEgg batterCakeWithEgg = new BatterCakeWithEgg();
        log.info(batterCakeWithEgg.getDesc() + "销售价格为 " + batterCakeWithEgg.cost());

        // 香肠煎饼
        BatterCakeWithSausage batterCakeWithSausage = new BatterCakeWithSausage();
        log.info(batterCakeWithSausage.getDesc() + "销售价格为 " + batterCakeWithEgg.cost());

    }

}