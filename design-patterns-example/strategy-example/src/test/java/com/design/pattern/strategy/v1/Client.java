package com.design.pattern.strategy.v1;

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
        PromotionActivity activity ;
       // 应用层参数
        String promotion = "FANXIAN";
        switch (promotion){
            case "FANXIAN" :
                activity = new PromotionActivity(new FanXianPromotionStrategy());
                break;
            case "LIJIAN":
                activity = new PromotionActivity(new LiJianPromotionStrategy());
                break;
            case "MANJIAN":
                activity = new PromotionActivity(new ManJianPromotionStrategy());
                break;
            default:
                activity = null;
        }
        if(!ObjectUtils.isEmpty(activity)){
            activity.execute();
        }
    }
}