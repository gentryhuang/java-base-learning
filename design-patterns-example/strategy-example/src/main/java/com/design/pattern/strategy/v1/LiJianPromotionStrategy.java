package com.design.pattern.strategy.v1;

import lombok.extern.slf4j.Slf4j;

/**
 * LiJianPromotionStrategy 立减（下单立减一定的金额）策略
 *
 * @author shunhua
 * @date 2019-09-28
 */
@Slf4j
public class LiJianPromotionStrategy implements PromotionStrategy {

    /**
     * 促销
     */
    @Override
    public void doPromotion() {
        log.info("立减促销，书籍的价格直接减去立减活动设置的价格");
    }
}