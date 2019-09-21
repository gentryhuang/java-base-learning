package com.design.pattern.adapter.demand;

import lombok.extern.slf4j.Slf4j;

/**
 * AC220V  需要被适配的电压
 *
 * @author shunhua
 * @date 2019-09-22
 */
@Slf4j
public class AC220V {
    /**
     * 220V交流电
     * @return
     */
    public int outputAC220V(){
        return 220;
    }

}