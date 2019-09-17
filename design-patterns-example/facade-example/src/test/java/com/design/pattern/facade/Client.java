package com.design.pattern.facade;

import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-09-17
 */
public class Client {

    @Test
    public void test(){
        PointsGift pointsGift = new PointsGift("机械键盘");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }

}