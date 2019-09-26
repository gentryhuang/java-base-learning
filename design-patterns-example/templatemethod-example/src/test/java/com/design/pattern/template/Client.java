package com.design.pattern.template;

import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-09-27
 */
public class Client {

    @Test
    public void test(){

        Course jvmCourse = new JvmCource(Boolean.TRUE);
        jvmCourse.makeCourse();

        Course feCourse = new FECourse();
        feCourse.makeCourse();

    }
}