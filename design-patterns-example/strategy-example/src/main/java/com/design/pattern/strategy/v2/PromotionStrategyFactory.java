package com.design.pattern.strategy.v2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * PromotionStrategyFactory 促销策略工厂
 *
 * @author shunhua
 * @date 2019-09-28
 */
public class PromotionStrategyFactory {
    /**
     * 策略集合
     */
    private final static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new ConcurrentHashMap<>();

    /**
     * 类加载的时候就开始创建对象
     */
    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN_STRATEGY,new LiJianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN_STRATEGY,new FanXianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN_STRATEGY,new ManJianPromotionStrategy());
    }

    /**
     * 单例的
     */
    private PromotionStrategyFactory(){}

    /**
     * 根据策略模式名获取对应的策略
     * @param strategy
     * @return
     */
    public static PromotionStrategy getPromotionStrategy(String strategy){
        return PROMOTION_STRATEGY_MAP.get(strategy);
    }


    private interface PromotionKey{
        /**
         * 立减策略
         */
        String LIJIAN_STRATEGY = "LIJIAN";
        /**
         * 满减策略
         */
        String MANJIAN_STRATEGY = "LIJIAN";
        /**
         * 返现策略
         */
        String FANXIAN_STRATEGY = "FANXIAN";
    }

}