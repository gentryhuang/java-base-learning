package com.design.pattern.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * GiftExchangeService
 *
 * @author shunhua
 * @date 2019-09-17
 */
@Slf4j
public class GiftExchangeService {
    /** 分别注入兑换涉及到的服务 */
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();


    /**
     * 这是一个提供给客户端的接口方法，礼物兑换细节已经封装在里面了
     * @param pointsGift
     */
    public void giftExchange(PointsGift pointsGift){
        // 如果资格通过，并且积分支付完成
       if(qualifyService.isAvailable(pointsGift) && pointsPaymentService.pay(pointsGift)){
          // 走物流
           String orderNo = shippingService.shipGift(pointsGift);
           log.info("物流系统完成");
       }
    }


}