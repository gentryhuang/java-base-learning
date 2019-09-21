package com.design.pattern.adapter.demand;

import lombok.extern.slf4j.Slf4j;

/**
 * PowerAdapter  电源适配器
 *
 * @author shunhua
 * @date 2019-09-22
 */
@Slf4j
public class PowerAdapter implements DC5V {
    /**
     *  通过组合的方式
     */
   private AC220V ac220V = new AC220V();

    @Override
    public int outPutDC5V() {
        int ac = ac220V.outputAC220V();
        int target = ac/44;
        // 变压处理
        log.info(String.format("适配器处理后，%dV电压变为%dV",220,target));
        return 5;
    }
}