package com.design.pattern.proxy.staticproxy;

import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-10-03
 */
public class Client {

    @Test
    public void test(){
        // 租房直接找代理
        RentalHouseServiceProxy proxy = new RentalHouseServiceProxy();
        proxy.rent();
    }

}