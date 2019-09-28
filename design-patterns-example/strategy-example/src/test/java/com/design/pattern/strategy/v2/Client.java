package com.design.pattern.strategy.v2;
import org.junit.Test;
import org.springframework.util.ObjectUtils;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-09-28
 */
public class Client {

    @Test
    public void test(){

       // 应用层参数
        String promotion = "FANXIAN";
        PromotionActivity activity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotion));
        if(!ObjectUtils.isEmpty(activity)){
            activity.execute();
        }
    }
}