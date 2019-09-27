package com.design.pattern.iterator.v2;

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
    public void test() {
        Course course1 = new Course("Java从入门到放弃");
        Course course2 = new Course("MySql从删库到跑路");
        Course course3 = new Course("Python从入门到精通");

        MyCollection<Course> collection = new MyCollection();
        collection.add(course1);
        collection.add(course2);
        collection.add(course3);

        log.info("----------课程列表-------------");
        printCourses(collection);

        collection.remove(course1);

        log.info("----------删除操作之后的课程----  ");
        printCourses(collection);

    }

    private void printCourses(MyCollection collection) {
        MyIterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Course course = (Course) iterator.next();
            log.info(course.toString());
        }
    }


}