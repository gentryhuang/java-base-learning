package com.design.pattern.iterator.v1;

/**
 * CourseIterator  迭代器接口
 *
 * @author shunhua
 * @date 2019-09-27
 */
public interface CourseIterator {
    /**
     * 下一个课程
     * @return
     */
    Course nextCourse();

    /**
     * 是否还有下一个课程
     * @return
     */
    boolean hasNext();
}
