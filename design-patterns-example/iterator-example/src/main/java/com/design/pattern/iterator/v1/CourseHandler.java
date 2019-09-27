package com.design.pattern.iterator.v1;

/**
 * CourseHandler
 *
 * @author shunhua
 * @date 2019-09-27
 */
public interface CourseHandler {
    /**
     * 增加课程
     * @param course
     */
    void addCourse(Course course);

    /**
     * 移除课程
     * @param course
     */
    void removeCourse(Course course);

    /**
     * 获取课程迭代器
     * @return
     */
    CourseIterator getIterator();
}