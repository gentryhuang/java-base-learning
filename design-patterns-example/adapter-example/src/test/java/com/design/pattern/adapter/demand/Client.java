package com.design.pattern.adapter.demand;

import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-09-22
 */
public class Client {

    @Test
    public void test() {
       DC5V dc5V = new PowerAdapter();
       // 通过PowerAdapter适配，把220V交流转为5V直流电
       dc5V.outPutDC5V();
    }
}