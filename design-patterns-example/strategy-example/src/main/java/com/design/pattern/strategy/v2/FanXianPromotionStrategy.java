package com.design.pattern.strategy.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * FanXianPromotionStrategy 返现（支付金额达到一定数额进行返现到账号）策略
 *
 * @author shunhua
 * @date 2019-09-28
 */
@Slf4j
public class FanXianPromotionStrategy implements PromotionStrategy {

    /**
     * 促销
     */
    @Override
    public void doPromotion() {
       log.info("返现促销，返回的金额存放到账号的余额中");
    }
}