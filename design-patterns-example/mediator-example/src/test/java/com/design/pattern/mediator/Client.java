package com.design.pattern.mediator;

import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-10-04
 */
public class Client {

    @Test
    public void test(){

        Worker worker = new Worker("舜华");

        Worker worker1= new Worker("高斯林");

        worker1.sendMsg("小伙子，就你还想学我的Java！！！");

        worker.sendMsg("有句话不知当讲不当讲？");
    }

}