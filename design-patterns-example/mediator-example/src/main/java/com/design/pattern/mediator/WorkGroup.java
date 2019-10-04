package com.design.pattern.mediator;


import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * WorkGroup 中介者 - 工作群
 *
 * @author shunhua
 * @date 2019-10-04
 */
@Slf4j
public class WorkGroup {
    /**
     * 中介者显示员工发送的消息
     * @param worker
     * @param msg
     */
    public static void showMsg(Worker worker, String msg){
        log.info(String.format("%s 【%s】: %s",new Date().toString(),worker.getName(),msg));
    }

}