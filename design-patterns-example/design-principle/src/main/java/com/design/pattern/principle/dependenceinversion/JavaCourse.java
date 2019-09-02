package com.design.pattern.principle.dependenceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * JavaCourse
 *
 * @author shunhua
 * @date 2019-09-02
 */
@Slf4j
public class JavaCourse implements ICourse {

    @Override
    public void learnCourse() {
        log.info("gentryhuang is learning java");
    }
}