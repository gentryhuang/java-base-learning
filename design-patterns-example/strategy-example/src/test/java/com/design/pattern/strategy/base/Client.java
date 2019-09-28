package com.design.pattern.strategy.base;

import com.design.pattern.strategy.base.FanXianPromotionStrategy;
import com.design.pattern.strategy.base.ManJianPromotionStrategy;
import com.design.pattern.strategy.base.PromotionActivity;
import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-09-28
 */
public class Client {

    @Test
    public void test(){
        /**
         * 618满减活动策略
         */
        PromotionActivity activity618 = new PromotionActivity(new ManJianPromotionStrategy());

        /**
         * 双11 返现活动策略
         */
        PromotionActivity activity11 = new PromotionActivity(new FanXianPromotionStrategy());

        activity618.execute();
        activity11.execute();
    }
}