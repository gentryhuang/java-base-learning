package com.design.pattern.iterator.v2;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Course  相当于集合中的元素
 *
 * @author shunhua
 * @date 2019-09-27
 */
@Data
@AllArgsConstructor
public class Course {
    /**
     * 课程的名字
     */
    private String name;

}