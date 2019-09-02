package com.design.pattern.principle.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * Person
 *
 * @author shunhua
 * @date 2019-09-02
 */
@Slf4j
public class Person {

    public void learnCource(ICourse course){
        course.learnCourse();
    }
}