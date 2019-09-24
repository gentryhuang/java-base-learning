package com.design.pattern.composite;

/**
 *  1. 方法中的抛出异常处理，是体现方法不能被使用，因为课程和课程目录使用的方法不同
 *  2. 课程和课程目录使用统一类型供客户端访问
 * @author shunhua
 * @date 2019-09-24
 */
public abstract class CourseComponet {
    /**
     * 扩展课程目录
     * @param courseComponet
     */
    public void addCatalog(CourseComponet courseComponet){
        throw new UnsupportedOperationException("不支持添加课程目录操作");
    }

    /**
     * 删除课程目录
     * @param courseComponet
     */
    public void removeCatalog(CourseComponet courseComponet){
        throw new UnsupportedOperationException("不支持删除课程目录操作");
    }

    /**
     * 获取课程名称
     * @param courseComponet
     * @return
     */
    public String getName(CourseComponet courseComponet){
        throw new UnsupportedOperationException("不支持获取课程名称操作");
    }

    /**
     * 获取课程价格
     * @param courseComponet
     * @return
     */
    public double getPrice(CourseComponet courseComponet){
        throw new UnsupportedOperationException("不支持获取课程价格操作");
    }

    /**
     * 打印信息
     */
    public void print(){
        throw new UnsupportedOperationException("不支持打印操作");
    }

}