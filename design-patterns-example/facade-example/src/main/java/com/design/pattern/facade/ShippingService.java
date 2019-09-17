package com.design.pattern.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * ShippingService
 *
 * @author shunhua
 * @date 2019-09-17
 */
@Slf4j
public class ShippingService {

    /**
     * 物流系统对接
     * @param pointsGift
     * @return
     */
    public String shipGift(PointsGift pointsGift){
       log.info(pointsGift.getName() + "进入物流系统");
       return "123456";
    }
}