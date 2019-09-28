package com.design.pattern.strategy.v2;

/**
 * PromotionActivity 促销活动，包装（使用）策略模式
 *
 * @author shunhua
 * @date 2019-09-28
 */
public class PromotionActivity {

    /**
     * 促销策略
     */
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }

    /**
     * 执行具体的促销策略
     */
    public void execute(){
        promotionStrategy.doPromotion();
    }
}