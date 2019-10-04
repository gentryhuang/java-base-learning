package com.design.pattern.mediator;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Worker 员工 被中介者协调的对象 ，通常称为“同事类”
 *
 * @author shunhua
 * @date 2019-10-04
 */
@Data
@AllArgsConstructor
public class Worker {
    /**
     * 花名
     */
    private String name;

    /**
     * 员工只和中介者（工作群）打交道，这是中介者模式的核心
     * @param msg
     */
    public void sendMsg(String msg){
        WorkGroup.showMsg(this,msg);
    }
}