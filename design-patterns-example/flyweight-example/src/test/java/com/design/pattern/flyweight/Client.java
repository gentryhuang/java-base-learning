package com.design.pattern.flyweight;

import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-09-23
 */
public class Client {
    private final String presentation[] = {"业务部","研发部","管理部"};

    @Test
    public void test(){
        for(int i = 0; i < 20; i++){
            String department = presentation[(int)(Math.random() * presentation.length)];
            LeaderPresentation leaderPresentation = (LeaderPresentation) PresentationFactory.getPresentation(department);
            leaderPresentation.report();
        }
    }

}