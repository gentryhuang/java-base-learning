package com.design.pattern.command;

import org.junit.Test;

/**
 * Boss 命令的下达者
 *
 * @author shunhua
 * @date 2019-10-04
 */
public class Boss {

    @Test
    public void test() throws InterruptedException {
        // 创建命令的行为体
        Project projectDevelopment = new Project("带你飞");
        // 创建命令对象(老板下达命令)
        MicroserviceCommand microserviceCommand = new MicroserviceCommand(projectDevelopment);
        MonomerCommand monomerCommand = new MonomerCommand(projectDevelopment);

        System.out.println("//-----------------------分别执行命令---------------------------/");

        // 员工接收并执行命令
        Staff staff = new Staff();
        staff.execureCommand(microserviceCommand);
        staff.execureCommand(monomerCommand);

        Thread.sleep(2000);

        System.out.println("//-----------------------统一执行命令集-------------------------/");

        // 员工接收多个命令,统一执行
        staff.addCommand(microserviceCommand);
        staff.addCommand(monomerCommand);
        staff.executeCommandList();

    }

}