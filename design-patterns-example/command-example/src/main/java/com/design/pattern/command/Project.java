package com.design.pattern.command;

import lombok.extern.slf4j.Slf4j;

/**
 * Project 项目
 *
 * @author shunhua
 * @date 2019-10-04
 */
@Slf4j
public class Project {
    /**
     * 项目名称
     */
    private String name;

    public Project(String name){
        this.name = name;
    }

    /**
     * 使用单体架构开发项目
     */
    public void monomer(){
       log.info(String.format("%s项目使用单体架构开发",this.name));
    }

    /**
     * 使用微服务架构开发项目
     */
    public void microservice(){
        log.info(String.format("%s项目使用微服务架构开发",this.name));
    }

}