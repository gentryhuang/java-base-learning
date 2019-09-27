package com.design.pattern.iterator.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * CourseHandlerImpl  就相当于集合
 *
 * @author shunhua
 * @date 2019-09-27
 */
public class CourseHandlerImpl implements CourseHandler {

    /**
     * 课程集合
     */
    private List courseList;

    public  CourseHandlerImpl(){
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
       this.courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        this.courseList.remove(course);
    }

    /**
     * 获取课程的迭代器,注意把课程处理中的课程集合传给迭代器，这个是关键
     * @return
     */
    @Override
    public CourseIterator getIterator() {
        return new CourseIteratorImpl(courseList);
    }
}