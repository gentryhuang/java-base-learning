package com.design.pattern.iterator.v1;

import com.design.pattern.iterator.v1.Course;
import com.design.pattern.iterator.v1.CourseHandler;
import com.design.pattern.iterator.v1.CourseHandlerImpl;
import com.design.pattern.iterator.v1.CourseIterator;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * Client
 *
 * @author shunhua
 * @date 2019-09-27
 */
@Slf4j
public class Client {

    @Test
    public void test(){
        Course course1 = new Course("Java从入门到放弃");
        Course course2 = new Course("MySql从删库到跑路");
        Course course3 = new Course("Python从入门到精通");

        CourseHandler courseHandler = new CourseHandlerImpl();
        courseHandler.addCourse(course1);
        courseHandler.addCourse(course2);
        courseHandler.addCourse(course3);

        log.info("----------课程列表-------------");
        printCourses(courseHandler);

        courseHandler.removeCourse(course1);

        log.info("----------删除操作之后的课程----  ");
        printCourses(courseHandler);

    }

    private void printCourses(CourseHandler courseHandler) {
        CourseIterator iterator = courseHandler.getIterator();
        while (iterator.hasNext()){
            Course course = iterator.nextCourse();
            log.info(course.toString());
        }
    }


}