package com.design.pattern.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * PointsPaymentService  积分支付
 *
 * @author shunhua
 * @date 2019-09-17
 */
@Slf4j
public class PointsPaymentService {

    /**
     * 积分兑换礼物
     * @param pointsGift
     * @return
     */
      public boolean pay(PointsGift pointsGift){
          log.info("支付" + pointsGift.getName() + "积分成功");
          return true;
      }
}