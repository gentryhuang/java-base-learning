package com.design.pattern.composite;

import lombok.extern.slf4j.Slf4j;

/**
 * Course  课程类
 *
 * @author shunhua
 * @date 2019-09-24
 */
@Slf4j
public class Course extends CourseComponet {
    /**
     * 课程名
     */
    private String courseName;
    /**
     * 课程价格
     */
    private double price;

    public Course(String courseName, double price) {
        this.courseName = courseName;
        this.price = price;
    }

    @Override
    public String getName(CourseComponet courseComponet) {
        return this.courseName;
    }

    @Override
    public double getPrice(CourseComponet courseComponet) {
        return this.price;
    }

    @Override
    public void print() {
       log.info("课程名：" + courseName + ", 课程价格：" + price);
    }
}