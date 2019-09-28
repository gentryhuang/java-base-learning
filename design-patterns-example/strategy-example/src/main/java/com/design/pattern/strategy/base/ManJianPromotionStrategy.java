package com.design.pattern.strategy.base;

import lombok.extern.slf4j.Slf4j;

/**
 * ManJianPromotionStrategy 满减（当支付金额达到规定的最低数就进行优惠）策略
 *
 * @author shunhua
 * @date 2019-09-28
 */
@Slf4j
public class ManJianPromotionStrategy implements PromotionStrategy {

    /**
     * 促销
     */
    @Override
    public void doPromotion() {
        log.info("满减促销，满200减50");
    }
}