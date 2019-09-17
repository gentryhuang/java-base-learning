package com.design.pattern.facade;

import lombok.extern.slf4j.Slf4j;

/**
 * QualifyService 校验系统
 *
 * @author shunhua
 * @date 2019-09-17
 */
@Slf4j
public class QualifyService {

    /**
     * 校验逻辑，积分是否够
     * @param pointsGift
     * @return
     */
    public boolean isAvailable(PointsGift pointsGift){
         log.info(pointsGift.getName() + "积分通过");
         return true;
    }

}