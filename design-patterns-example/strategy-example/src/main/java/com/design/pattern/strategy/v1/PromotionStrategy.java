package com.design.pattern.strategy.v1;

/**
 * PromotionStrategy 促销策略父类型
 * @author shunhua
 * @date 2019-09-28
 */
public interface PromotionStrategy {
    /**
     * 进行促销
     */
    void doPromotion();
}