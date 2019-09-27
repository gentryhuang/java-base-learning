package com.design.pattern.iterator.v1;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * CourseIteratorImpl
 *
 * @author shunhua
 * @date 2019-09-27
 */
@Slf4j
public class CourseIteratorImpl implements CourseIterator {

    /**
     * 课程集合
     */
    private List courseList ;
    /**
     * 游标
     */
    private int position;

    /**
     * 课程
     */
    private Course course;

    public CourseIteratorImpl(List courseList){
        this.courseList = courseList;
    }

    /**
     * 迭代课程
     * @return
     */
    @Override
    public Course nextCourse() {
        log.info("返回课程，位置是：" + position);
        course = (Course) courseList.get(position);
        position ++;
        return course;
    }

    /**
     * 是否还有下一个
     * @return
     */
    @Override
    public boolean hasNext() {
        if(position < courseList.size()){
            return true;
        }
        return false;
    }
}