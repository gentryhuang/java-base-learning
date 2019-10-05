package com.design.pattern.proxy.cglibproxy;

import lombok.extern.slf4j.Slf4j;

/**
 * RentalHouseServiceImpl 目标类
 *
 * @author shunhua
 * @date 2019-10-03
 */
@Slf4j
public class RentalHouseServiceImpl implements IRentalHouseService {

    /**
     * 出租房子，目标方法
     * @return
     */
    @Override
    public void rent(){
        log.info("1800/月，2室1厅1厨1卫！");
    }

}