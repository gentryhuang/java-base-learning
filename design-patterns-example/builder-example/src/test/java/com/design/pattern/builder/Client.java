package com.design.pattern.builder;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-09-11
 */
@Slf4j
public class Client {

    @Test
    public void test(){
        CourseBuilder courseBuilder = new ActualCourseBuilder();
        Assistant assistant = new Assistant();
        assistant.setCourseBuilder(courseBuilder);
        Course course = assistant.buildCourse("Java进阶","ppt","Java进阶视频");
        log.info(course.toString());
    }

}