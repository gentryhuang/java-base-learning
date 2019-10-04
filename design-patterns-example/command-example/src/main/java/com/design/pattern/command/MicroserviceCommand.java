package com.design.pattern.command;

/**
 * MicroserviceCommand  微服务架构开发命令类，执行的是微服务架构开发
 *
 * @author shunhua
 * @date 2019-10-04
 */
public class MicroserviceCommand implements Command {

    /**
     * 组合，命令对应的行为体 (非必须的，命令的行为可以根据具体业务编写)
     */
    private Project project;

    /**
     * 构造方法
     * @param project
     */
    public MicroserviceCommand(Project project){
        this.project = project;
    }

    /**
     * 执行命令
     */
    @Override
    public void execute() {
        project.microservice();
    }
}